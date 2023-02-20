package com.xfjyg.managementservice.controller.test;

import com.google.common.collect.ImmutableMap;
import com.xfjyg.appcommon.config.redis.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/response")
public class TestResponseController {
    @Autowired
    RedisCache redisCache;

    @GetMapping("/json")
    public ResponseEntity hello() {
        return ResponseEntity.ok(ImmutableMap.of("hello", "world"));
    }

    @GetMapping("/empty")
    public void empty() {

    }
}
