package com.xfjyg.managementservice.controller.system;

import com.xfjyg.managementservice.entity.MenuToRoleEditParam;
import com.xfjyg.managementservice.entity.PageQuery;
import com.xfjyg.managementservice.entity.gen.Role;
import com.xfjyg.managementservice.service.system.RoleService;
import com.xfjyg.managementservice.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/system/role")
@Api("用户管理")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/list")
    @ApiOperation("获取list")
    public R getList() {
        return R.success(roleService.getList());
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody Role role) {
        roleService.doAdd(role);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑")
    public void edit(@RequestBody Role role) {
        roleService.doEdit(role);
    }

    @GetMapping("/detail")
    @ApiOperation("获取详情")
    public R detail(@RequestParam("roleId") Long roleId) {
        return R.success(roleService.getDetail(roleId));
    }

    @GetMapping("/menuPageInfoByRoleId")
    @ApiOperation("获取菜单分页")
    public R getMenuPageInfoByRoleId(PageQuery query, @RequestParam("roleId") Long roleId) {
        return R.success(roleService.getMenuPageInfoByRoleId(query, roleId));
    }

    @ApiOperation("获取菜单treeList")
    @GetMapping("/menuTreeListByRoleId")
    public R getMenuTreeListByRoleId(@RequestParam("roleId") Long roleId) {
        return R.success();
    }

    @ApiOperation("删除后新增菜单to角色")
    @PostMapping("/deleteThenAddMenuToRole")
    public R deleteThenAddMenuToRole(@RequestBody MenuToRoleEditParam param) {
        return R.success();
    }

    @GetMapping("/userPageInfoByRoleId")
    @ApiOperation("获取用户分页")
    public R getUserPageInfoByRoleId(PageQuery query, @RequestParam("roleId") Long roleId) {
        return R.success();
    }

    @PostMapping("/addUserToRole")
    @ApiOperation("添加用户to角色")
    public R addUserToRole() {
        return R.success();
    }

    @PostMapping("/deleteUserToRole")
    @ApiOperation("删除用户to角色")
    public R deleteUserToRole() {
        return R.success();
    }

}
