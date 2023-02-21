package com.xfjyg.managementservice.service.system;

import com.xfjyg.managementservice.entity.objecttree.ObjectTree;
import com.xfjyg.managementservice.entity.gen.Dept;

import java.util.List;

public interface DeptService {
    List<ObjectTree<Integer>> getTreeList();

    void doAdd(Dept dept);

    void doEdit(Dept dept);

    Dept getDetail(Long deptId);
}
