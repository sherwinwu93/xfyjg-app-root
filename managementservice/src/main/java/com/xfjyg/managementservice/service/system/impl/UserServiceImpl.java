package com.xfjyg.managementservice.service.system.impl;

import com.github.pagehelper.PageInfo;
import com.xfjyg.managementservice.entity.PageQuery;
import com.xfjyg.managementservice.entity.gen.User;
import com.xfjyg.managementservice.service.system.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getList() {
        return null;
    }

    @Override
    public PageInfo<User> getPageInfo(PageQuery query) {
        return null;
    }

    @Override
    public void doAdd(User user) {

    }

    @Override
    public void doEdit(User user) {

    }

    @Override
    public User getDetail(Long userId) {
        return null;
    }
}