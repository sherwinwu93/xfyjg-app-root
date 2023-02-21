package com.xfjyg.managementservice.mapper.gen;

import com.xfjyg.managementservice.entity.gen.Dept;
import com.xfjyg.managementservice.entity.gen.DeptExample;
import java.util.List;

public interface DeptMapper {
    long countByExample(DeptExample example);

    int deleteByPrimaryKey(Long deptId);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Long deptId);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}