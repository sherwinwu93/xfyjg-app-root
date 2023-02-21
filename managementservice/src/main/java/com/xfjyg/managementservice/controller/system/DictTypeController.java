package com.xfjyg.managementservice.controller.system;

import com.xfjyg.managementservice.entity.query.DictTypeQuery;
import com.xfjyg.managementservice.entity.query.PageQuery;
import com.xfjyg.managementservice.entity.gen.DictType;
import com.xfjyg.managementservice.service.system.DictTypeService;
import com.xfjyg.managementservice.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/system/dict/dictType")
@Api(description = "系统-字典类型")
public class DictTypeController {
    @Autowired
    private DictTypeService dictTypeService;

    @GetMapping("/pageInfo")
    @ApiOperation("获取分页")
    public R getPageInfo(DictTypeQuery query) {
        return R.success(dictTypeService.getPageInfo(query));
    }

    @ApiOperation("获取list")
    @GetMapping("/list")
    public R getList() {
        return R.success(dictTypeService.getList());
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody DictType dictType) {
        dictTypeService.doAdd(dictType);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑")
    public void edit(@RequestBody DictType dictType) {
        dictTypeService.doEdit(dictType);
    }

    @GetMapping("/detail")
    @ApiOperation("获取详情")
    public R detail(@RequestParam("dictTypeId") Long dictTypeId) {
        return R.success(dictTypeService.getDetail(dictTypeId));
    }
}
