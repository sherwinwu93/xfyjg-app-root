package com.xfjyg.managementservice.service.system.impl;

import com.xfjyg.managementservice.entity.objecttree.ObjectTree;
import com.xfjyg.managementservice.entity.gen.Dept;
import com.xfjyg.managementservice.service.system.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Override
    public List<ObjectTree<Integer>> getTreeList() {
        return null;
    }

    @Override
    public void doAdd(Dept dept) {

    }

    @Override
    public void doEdit(Dept dept) {

    }

    @Override
    public Dept getDetail(Long deptId) {
        return null;
    }
}
