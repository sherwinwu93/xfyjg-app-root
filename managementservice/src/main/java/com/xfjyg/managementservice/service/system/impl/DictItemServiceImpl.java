package com.xfjyg.managementservice.service.system.impl;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.PageQuery;
import com.xfjyg.managementservice.entity.gen.DictItem;
import com.xfjyg.managementservice.service.system.DictItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictItemServiceImpl implements DictItemService {

    @Override
    public List<DictItem> getList() {
        return null;
    }

    @Override
    public PageInfo<DictItem> getPageInfo(PageQuery query) {
        return null;
    }

    @Override
    public void doAdd(DictItem dictItem) {

    }

    @Override
    public void doEdit(DictItem dictItem) {

    }

    @Override
    public DictItem getDetail(Long dictItemId) {
        return null;
    }
}