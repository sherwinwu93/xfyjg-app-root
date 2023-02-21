package com.xfjyg.managementservice.entity.query;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserQuery extends PageQuery {
    private Byte status;
    private String keyword;
}
