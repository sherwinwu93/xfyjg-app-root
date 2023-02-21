package com.xfjyg.managementservice.entity.objecttree;

import java.util.List;

public class ObjectTreeImpl<T> implements ObjectTree<T> {
    private String label;
    private T value;
    private List<ObjectTreeImpl<T>> children;

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }
}
