package com.xfjyg.managementservice.entity.query;

import lombok.Setter;

@Setter
public class PageQuery {
    private Integer pageIndex;
    private Integer pageSize;

    public Integer getPageIndex() {
        if (pageIndex == null || pageIndex < 1) pageIndex = 1;
        return pageIndex;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1) pageIndex = 5;
        return pageSize;
    }
}
