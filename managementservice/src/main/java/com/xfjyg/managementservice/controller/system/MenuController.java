package com.xfjyg.managementservice.controller.system;

import com.xfjyg.managementservice.entity.gen.Menu;
import com.xfjyg.managementservice.entity.query.MenuQuery;
import com.xfjyg.managementservice.service.system.MenuService;
import com.xfjyg.managementservice.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/system/menu")
@Api(description = "系统-菜单")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/treeList")
    @ApiOperation("获取treeList")
    public R getMenuTreeList() {
        return R.success(menuService.getMenuTreeList());
    }

    @ApiOperation("获取list")
    @GetMapping("/list")
    public R getList(@RequestBody MenuQuery query) {
        return R.success(menuService.getList());
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody Menu menu) {
        menuService.doAdd(menu);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑")
    public void edit(@RequestBody Menu menu) {
        menuService.doEdit(menu);
    }

    @GetMapping("/detail")
    @ApiOperation("获取详情")
    public R detail(@RequestParam("menuId") Long menuId) {
        return R.success(menuService.getDetail(menuId));
    }
}
