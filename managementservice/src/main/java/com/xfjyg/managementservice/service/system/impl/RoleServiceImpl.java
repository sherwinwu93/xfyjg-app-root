package com.xfjyg.managementservice.service.system.impl;

import com.xfjyg.managementservice.entity.query.PageQuery;
import com.xfjyg.managementservice.entity.gen.Menu;
import com.xfjyg.managementservice.entity.gen.Role;
import com.xfjyg.managementservice.service.system.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public List<Role> getList() {
        return null;
    }

    @Override
    public void doAdd(Role role) {

    }

    @Override
    public void doEdit(Role role) {

    }

    @Override
    public Role getDetail(Long roleId) {
        return null;
    }

    @Override
    public List<Menu> getMenuPageInfoByRoleId(PageQuery query, Long roleId) {
        return null;
    }
}