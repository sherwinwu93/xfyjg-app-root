package com.xfjyg.managementservice.controller.test;

import com.xfjyg.appcommon.exception.ExceptionDef;
import com.xfjyg.appcommon.exception.runtimeexception.ExceptionFactory;
import com.xfjyg.managementservice.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/ex")
public class TestExceptionController {

    @GetMapping("/byZero")
    public R byZero() {
        int i = 1/0;
        return R.success("2");
    }

    @GetMapping("/custom")
    public R custom() {
        throw ExceptionFactory.create(ExceptionDef.CODE_DUPLICATE_CONTENT);
    }
}
