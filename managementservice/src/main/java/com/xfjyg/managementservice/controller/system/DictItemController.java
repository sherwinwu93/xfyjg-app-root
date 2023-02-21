package com.xfjyg.managementservice.controller.system;

import com.xfjyg.managementservice.entity.PageQuery;
import com.xfjyg.managementservice.entity.gen.DictItem;
import com.xfjyg.managementservice.service.system.DictItemService;
import com.xfjyg.managementservice.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/system/dict/dictItem")
@Api("用户管理")
public class DictItemController {
    @Autowired
    private DictItemService dictItemService;

    @GetMapping("/pageInfo")
    @ApiOperation("获取分页")
    public R getPageInfo(PageQuery query) {
        return R.success(dictItemService.getPageInfo(query));
    }

    @ApiOperation("获取list")
    @GetMapping("/list")
    public R getList() {
        return R.success(dictItemService.getList());
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public void add(@RequestBody DictItem dictItem) {
        dictItemService.doAdd(dictItem);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑")
    public void edit(@RequestBody DictItem dictItem) {
        dictItemService.doEdit(dictItem);
    }

    @GetMapping("/detail")
    @ApiOperation("获取详情")
    public R detail(@RequestParam("dictItemId") Long dictItemId) {
        return R.success(dictItemService.getDetail(dictItemId));
    }
}
