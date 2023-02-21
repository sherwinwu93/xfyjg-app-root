package com.xfjyg.managementservice.service.system;

import com.xfjyg.managementservice.entity.PageQuery;
import com.xfjyg.managementservice.entity.gen.Menu;
import com.xfjyg.managementservice.entity.gen.Role;

import java.util.List;

public interface RoleService {
    List<Role> getList();

    void doAdd(Role role);

    void doEdit(Role role);

    Role getDetail(Long roleId);

    List<Menu> getMenuPageInfoByRoleId(PageQuery query, Long roleId);
}
