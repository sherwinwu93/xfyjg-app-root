package com.xfjyg.managementservice.controller.system;

import com.xfjyg.managementservice.entity.gen.Dept;
import com.xfjyg.managementservice.service.system.DeptService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import com.xfjyg.managementservice.utils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/system/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/treeList")
    @ApiOperation("获取treeList")
    public R getTreeList() {
        return R.success(deptService.getTreeList());
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody Dept dept) {
        deptService.doAdd(dept);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑")
    public R edit(@RequestBody Dept dept) {
        deptService.doEdit(dept);
        return R.success();
    }

    @GetMapping("/detail")
    @ApiOperation("获取详情")
    public R detail(@RequestParam("deptId") Long deptId) {
        return R.success(deptService.getDetail(deptId));
    }
}
