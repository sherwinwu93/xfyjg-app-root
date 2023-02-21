package com.xfjyg.managementservice.service.system;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.query.DictItemQuery;
import com.xfjyg.managementservice.entity.query.PageQuery;
import com.xfjyg.managementservice.entity.gen.DictItem;

import java.util.List;

public interface DictItemService {
    List<DictItem> getList();

    PageInfo<DictItem> getPageInfo(DictItemQuery query);

    void doAdd(DictItem dictItem);

    void doEdit(DictItem dictItem);

    DictItem getDetail(Long dictItemId);
}
