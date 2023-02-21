package com.xfjyg.managementservice.service.system.impl;

import com.xfjyg.managementservice.entity.gen.Menu;
import com.xfjyg.managementservice.entity.objecttree.ObjectTree;
import com.xfjyg.managementservice.service.system.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Override
    public List<Menu> getList() {
        return null;
    }

    @Override
    public List<ObjectTree<Menu>> getMenuTreeList() {
        return null;
    }

    @Override
    public void doAdd(Menu menu) {

    }

    @Override
    public void doEdit(Menu menu) {

    }

    @Override
    public Menu getDetail(Long menuId) {
        return null;
    }
}
