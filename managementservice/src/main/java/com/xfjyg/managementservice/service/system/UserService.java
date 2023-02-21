package com.xfjyg.managementservice.service.system;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.gen.User;
import com.xfjyg.managementservice.entity.query.UserQuery;

import java.util.List;

public interface UserService {
    List<User> getList();

    PageInfo<User> getPageInfo(UserQuery query);

    void doAdd(User user);

    void doEdit(User user);

    User getDetail(Long userId);
}
