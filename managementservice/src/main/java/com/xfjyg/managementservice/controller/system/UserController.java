package com.xfjyg.managementservice.controller.system;

import com.xfjyg.managementservice.entity.query.PageQuery;
import com.xfjyg.managementservice.entity.gen.User;
import com.xfjyg.managementservice.entity.query.UserQuery;
import com.xfjyg.managementservice.service.system.UserService;
import com.xfjyg.managementservice.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/system/user")
@Api(description = "系统-用户")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/pageInfo")
    @ApiOperation("获取分页")
    public R getPageInfo(UserQuery query) {
        return R.success(userService.getPageInfo(query));
    }

    @ApiOperation("获取list")
    @GetMapping("/list")
    public R getList() {
        return R.success(userService.getList());
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody User user) {
        userService.doAdd(user);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑")
    public void edit(@RequestBody User user) {
        userService.doEdit(user);
    }

    @GetMapping("/detail")
    @ApiOperation("获取详情")
    public R detail(@RequestParam("userId") Long userId) {
        return R.success(userService.getDetail(userId));
    }

    @PutMapping("/enableOrDisable")
    @ApiOperation("启用/禁用")
    public R enableOrDisable(@RequestParam("userId") Long userId) {
        return R.success();
    }
}
