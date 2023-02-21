package com.xfjyg.managementservice.service.system.impl;

import com.github.pagehelper.PageInfo;
import com.xfjyg.appcommon.exception.ExceptionDef;
import com.xfjyg.appcommon.exception.runtimeexception.ExceptionFactory;
import com.xfjyg.appcommon.utils.PasswordUtils;
import com.xfjyg.managementservice.entity.gen.UserExample;
import com.xfjyg.managementservice.entity.gen.User;
import com.xfjyg.managementservice.entity.query.UserQuery;
import com.xfjyg.managementservice.mapper.gen.UserMapper;
import com.xfjyg.managementservice.service.system.UserService;
import com.xfjyg.managementservice.utils.PageUtils;
import com.xfjyg.managementservice.utils.SqlUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getList() {
        return null;
    }

    @Override
    public PageInfo<User> getPageInfo(UserQuery query) {
        UserExample example = new UserExample();
        UserExample.Criteria c = example.createCriteria();
        UserExample.Criteria c2 = example.createCriteria();
        if (query.getStatus() != null)
            c.andStatusEqualTo(query.getStatus());
        if (StringUtils.isNotEmpty(query.getKeyword())) {
            c.andRealnameLike(SqlUtils.like(query.getKeyword()));
            c2.andPhoneLike(SqlUtils.like(query.getKeyword()));
        }
        PageUtils.startPage(query);
        List<User> list = mapper.selectByExample(example);
        return PageUtils.createPageInfo(list);
    }

    @Override
    public void doAdd(User user) {
        validateAdd(user);
    }

    private void validateAdd(User user) {
        if (StringUtils.isEmpty(user.getUsername()))
            throw ExceptionFactory.create(ExceptionDef.CODE_ILLEGAL_CONTENT, "用户名不能为空");
        if (StringUtils.isEmpty(user.getPassword()))
            throw ExceptionFactory.create(ExceptionDef.CODE_ILLEGAL_CONTENT, "密码不能为空");
        if (StringUtils.isEmpty(user.getPhone()))
            throw ExceptionFactory.create(ExceptionDef.CODE_ILLEGAL_CONTENT, "电话不能为空");
        PasswordUtils.validateQualifiedPassword(user.getPassword());
    }

    @Override
    public void doEdit(User user) {

    }

    @Override
    public User getDetail(Long userId) {
        return null;
    }
}