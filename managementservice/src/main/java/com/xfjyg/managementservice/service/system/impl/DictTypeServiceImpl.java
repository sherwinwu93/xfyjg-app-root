package com.xfjyg.managementservice.service.system.impl;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.query.PageQuery;
import com.xfjyg.managementservice.entity.gen.DictType;
import com.xfjyg.managementservice.service.system.DictTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictTypeServiceImpl implements DictTypeService {

    @Override
    public List<DictType> getList() {
        return null;
    }

    @Override
    public PageInfo<DictType> getPageInfo(PageQuery query) {
        return null;
    }

    @Override
    public void doAdd(DictType dictType) {

    }

    @Override
    public void doEdit(DictType dictType) {

    }

    @Override
    public DictType getDetail(Long dictTypeId) {
        return null;
    }
}