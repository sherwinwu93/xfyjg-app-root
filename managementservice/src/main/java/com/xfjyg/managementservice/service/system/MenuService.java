package com.xfjyg.managementservice.service.system;

import com.xfjyg.managementservice.entity.objecttree.ObjectTree;
import com.xfjyg.managementservice.entity.gen.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getList();

    List<ObjectTree<Menu>> getMenuTreeList();

    void doAdd(Menu menu);

    void doEdit(Menu menu);

    Menu getDetail(Long menuId);
}
