package com.xfjyg.sapiservice.exception.handler;

import com.xfjyg.sapiservice.exception.ExceptionDef;
import com.xfjyg.sapiservice.exception.runtimeexception.AppRuntimeException;
import com.xfjyg.sapiservice.exception.runtimeexception.RuntimeExceptionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.AccessDeniedException;
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
        String url = request.getRequestURI().substring(request.getContextPath().length());

        log.info("e->{}", ex);
        AppRuntimeException are;
        if (ex instanceof AppRuntimeException) {
            are = (AppRuntimeException) ex;
        } else if (ex instanceof DataAccessException) {
            are = RuntimeExceptionFactory.create(
                    ExceptionDef.CODE_SYS_ERR, "系统错误：请求数据库失败");
        } else if (ex instanceof NullPointerException) {
            are = RuntimeExceptionFactory.create(
                    ExceptionDef.CODE_SYS_ERR, "系统错误：数据加载失败");
        } else if (ex instanceof RemoteAccessException) {
            are = RuntimeExceptionFactory.create(
                    ExceptionDef.CODE_SYS_ERR, "系统错误：远程服务未响应");
        } else if (ex instanceof AccessDeniedException) {
            are = RuntimeExceptionFactory.create(
                    ExceptionDef.USER_PRIVILEGE_ERR);
        } else if (ex instanceof AuthenticationException) {
            are = RuntimeExceptionFactory.create(
                    ExceptionDef.USER_AUTH_ERR);
        } else {
            are = RuntimeExceptionFactory.create(ExceptionDef.CODE_SYS_ERR, ex.getMessage());
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
