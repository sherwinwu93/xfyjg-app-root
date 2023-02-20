package com.xfjyg.managementservice.controller.test;

import com.xfjyg.appcommon.exception.ExceptionDef;
import com.xfjyg.appcommon.exception.runtimeexception.RuntimeExceptionFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/ex")
public class TestExceptionController {

    @GetMapping("/byZero")
    public ResponseEntity byZero() {
        int i = 1/0;
        return ResponseEntity.ok("2");
    }

    @GetMapping("/custom")
    public ResponseEntity custom() {
        throw RuntimeExceptionFactory.create(ExceptionDef.CODE_DUPLICATE_CONTENT);
    }
}
