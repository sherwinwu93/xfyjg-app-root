package com.xfjyg.managementservice.service.system;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.PageQuery;
import com.xfjyg.managementservice.entity.gen.User;

import java.util.List;

public interface UserService {
    List<User> getList();

    PageInfo<User> getPageInfo(PageQuery query);

    void doAdd(User user);

    void doEdit(User user);

    User getDetail(Long userId);
}
