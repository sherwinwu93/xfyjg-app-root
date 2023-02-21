package com.xfjyg.appcommon.exception.handler;

import com.xfjyg.appcommon.exception.ExceptionDef;
import com.xfjyg.appcommon.exception.runtimeexception.AppRuntimeException;
import com.xfjyg.appcommon.exception.runtimeexception.ExceptionFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bean on 2019/3/5.
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView errorHandler(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        if (ex instanceof AppRuntimeException) {
            return handleAppRuntimeException(request, response, (AppRuntimeException) ex);
        } else {
            return handleOtherException(request, response, ex);
        }
    }

    private ModelAndView handleAppRuntimeException(HttpServletRequest request, HttpServletResponse response, AppRuntimeException are) {
        if (StringUtils.startsWith(are.getCode(), ExceptionDef.INFORMATION_PREFIX)) {
            log.warn("e->{}", are);
        } else {
            log.error("e->{}", are);
        }
        response.setStatus(are.getHttpStatus());
        return buildModelAndView(are.getCode(), are.getMsg());
    }
    private ModelAndView handleOtherException(HttpServletRequest request, HttpServletResponse response, Exception ex) {
        log.error("e->{}", ex);
        AppRuntimeException are;
        if (ex instanceof DataAccessException) {
            are = ExceptionFactory.create(
                    ExceptionDef.CODE_SYS_ERR, "系统错误：请求数据库失败");
        } else if (ex instanceof NullPointerException) {
            are = ExceptionFactory.create(
                    ExceptionDef.CODE_SYS_ERR, "系统错误：数据加载失败");
        } else if (ex instanceof RemoteAccessException) {
            are = ExceptionFactory.create(
                    ExceptionDef.CODE_SYS_ERR, "系统错误：远程服务未响应");
        } else if (ex instanceof AccessDeniedException) {
            are = ExceptionFactory.create(
                    ExceptionDef.USER_AUTH_ERR);
        } else if (ex instanceof AuthenticationException) {
            are = ExceptionFactory.create(
                    ExceptionDef.USER_PRIVILEGE_ERR);
        } else {
            are = ExceptionFactory.create(ExceptionDef.CODE_SYS_ERR, ex.getMessage());
        }
        response.setStatus(are.getHttpStatus());
        return buildModelAndView(are.getCode(), are.getMsg());
    }

    private ModelAndView buildModelAndView(String code, String message) {
        return buildModelAndView(code, message, null);
    }

    private ModelAndView buildModelAndView(String code, String message, Object data) {
        ModelAndView mv = new ModelAndView();

        Map<String, Object> attributes = new HashMap<>();
        attributes.put("code", code);
        attributes.put("msg", message);

        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setAttributesMap(attributes);
        mv.setView(view);
        return mv;
    }

}
