package com.xfjyg.managementservice.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MenuToRoleEditParam {
    private List<Long> menuIdList;
    private Long roleId;
}
