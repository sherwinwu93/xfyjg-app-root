package com.xfjyg.managementservice.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.query.PageQuery;

import java.util.List;

public class PageUtils {
    public static <E> Page<E> startPage(PageQuery query) {
        return PageHelper.startPage(query.getPageIndex(), query.getPageSize());
    }

    public static <E> PageInfo<E> createPageInfo(List<E> list) {
        return new PageInfo<>(list);
    }
}
