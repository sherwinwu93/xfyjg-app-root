package com.xfjyg.managementservice.controller;

import com.google.common.collect.ImmutableMap;
import com.xfjyg.managementservice.entity.gen.TestUser;
import com.xfjyg.managementservice.service.BasicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import com.xfjyg.managementservice.utils.R;
import org.springframework.web.bind.annotation.*;

@Api(description = "登录/注册")
@RequestMapping("/v1/basic")
@RestController
public class BasicController {
    @Autowired
    private BasicService basicService;

    @PostMapping("/login")
    @ApiOperation("登陆")
    public R login(@RequestParam("username") String username,
                                        @RequestParam("password") String password) {
        String token = basicService.login(username, password);
        return R.success(ImmutableMap.of("access_token", token, "token_type", "bearer"));
    }

    @PostMapping("/register")
    @ApiOperation("注册")
    public R<TestUser> register(@RequestBody TestUser user) {
        return R.success(basicService.doRegister(user));
    }
}
