package com.xfjyg.sapiservice.controller.test;

import com.google.common.collect.ImmutableMap;
import com.xfjyg.sapiservice.config.redis.RedisCache;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test/auth")
@Api("测试认证/授权")
public class TestAuthController {
    @Autowired
    RedisCache redisCache;

    @GetMapping("/admin")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public Map admin() {
        return ImmutableMap.of("admin", "admin");
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    public Map user() {
        return ImmutableMap.of("user", "user");
    }

    @GetMapping("/all")
    public Map all() {
        return ImmutableMap.of("all", "all");
    }

    @GetMapping("/authenticated")
    @PreAuthorize("isAuthenticated()")
    @ApiOperation("只需登录")
    public Map authenticated() {
        return ImmutableMap.of("all", "all");
    }
}
