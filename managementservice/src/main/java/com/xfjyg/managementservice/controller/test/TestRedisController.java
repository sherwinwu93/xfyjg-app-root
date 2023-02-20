package com.xfjyg.managementservice.controller.test;

import com.xfjyg.appcommon.config.redis.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/redis")
public class TestRedisController {
    @Autowired
    RedisCache redisCache;

    @PostMapping("/hello")
    public String hello() {
        redisCache.setCacheObject("hello", "world");
        return redisCache.getCacheObject("hello");
    }
}
