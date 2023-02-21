package com.xfjyg.managementservice.controller.test;

import com.google.common.collect.ImmutableMap;
import com.xfjyg.appcommon.config.redis.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import com.xfjyg.managementservice.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/response")
public class TestResponseController {
    @Autowired
    RedisCache redisCache;

    @GetMapping("/json")
    public R hello() {
        return R.success(ImmutableMap.of("hello", "world"));
    }

    @GetMapping("/empty")
    public void empty() {

    }
}
