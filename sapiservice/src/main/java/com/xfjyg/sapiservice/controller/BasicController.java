package com.xfjyg.sapiservice.controller;

import com.google.common.collect.ImmutableMap;
import com.xfjyg.sapiservice.entity.gen.TestUser;
import com.xfjyg.sapiservice.service.BasicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(description = "登录/注册")
@RequestMapping("/v1/basic")
@RestController
public class BasicController {
    @Autowired
    private BasicService basicService;

    @PostMapping("/login")
    @ApiOperation("登陆")
    public ResponseEntity login(@RequestParam("username") String username,
                                        @RequestParam("password") String password) {
        String token = basicService.login(username, password);
        return ResponseEntity.ok(ImmutableMap.of("access_token", token, "token_type", "bearer"));
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public ResponseEntity<TestUser> register(@RequestBody TestUser user) {
        return ResponseEntity.ok(basicService.doRegister(user));
    }
}
