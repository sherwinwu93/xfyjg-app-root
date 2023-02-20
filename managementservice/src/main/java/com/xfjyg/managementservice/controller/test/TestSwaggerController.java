package com.xfjyg.managementservice.controller.test;

import com.google.common.collect.ImmutableMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test/swagger")
@Api("测试swagger")
public class TestSwaggerController {
    @GetMapping("/x")
    @ApiOperation("接口")
    public Map testX(){
        return ImmutableMap.of("x", "y");
    }
}
