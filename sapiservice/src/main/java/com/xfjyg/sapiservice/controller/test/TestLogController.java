package com.xfjyg.sapiservice.controller.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/log")
@Slf4j
public class TestLogController {

    @GetMapping("/debug")
    public void debug() {
        log.debug("TestLogController.debug");
    }

    @GetMapping("/info")
    public void info() {
        log.info("TestLogController.info");
    }

    @GetMapping("/warn")
    public void warn() {
        log.warn("TestLogController.warn");
    }

    @GetMapping("/error")
    public void error() {
        log.error("TestLogController.error");
    }
}
