package com.xfjyg.managementservice.service.system;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.query.PageQuery;
import com.xfjyg.managementservice.entity.gen.DictType;

import java.util.List;

public interface DictTypeService {
    List<DictType> getList();

    PageInfo<DictType> getPageInfo(PageQuery query);

    void doAdd(DictType dictType);

    void doEdit(DictType dictType);

    DictType getDetail(Long dictTypeId);
}
