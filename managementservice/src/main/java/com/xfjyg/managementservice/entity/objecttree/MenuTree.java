package com.xfjyg.managementservice.entity.objecttree;

import com.xfjyg.managementservice.entity.gen.Menu;

import java.util.List;

public class MenuTree extends Menu implements ObjectTree<Long> {
    private List<MenuTree> children;

    @Override
    public String getLabel() {
        return this.getMenuName();
    }

    @Override
    public void setLabel(String label) {
        super.setMenuName(label);
    }

    @Override
    public Long getValue() {
        return this.getMenuId();
    }

    @Override
    public void setValue(Long value) {
        super.setMenuId(value);
    }

    @Override
    public List getChildren() {
        return this.children;
    }

    @Override
    public void setChildren(List children) {
        this.children = children;
    }
}
