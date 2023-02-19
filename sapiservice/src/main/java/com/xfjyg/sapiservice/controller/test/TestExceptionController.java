package com.xfjyg.sapiservice.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/ex")
public class TestExceptionController {

    @GetMapping("/byZero")
    public String byZero() {
        int i = 1/0;
        return "2";
    }
}
