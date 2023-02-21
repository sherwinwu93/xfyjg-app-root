package com.xfjyg.managementservice.entity.objecttree;

import java.util.List;

// 无父id的,默认为0,0为默认根节点
public interface ObjectTree<T> {

    public String getLabel();

    public void setLabel(String label);

    public T getValue();

    public void setValue(T value);

    public List getChildren();

    public void setChildren(List children);
}
