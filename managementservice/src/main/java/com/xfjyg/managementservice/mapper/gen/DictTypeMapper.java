package com.xfjyg.managementservice.mapper.gen;

import com.xfjyg.managementservice.entity.gen.DictType;
import com.xfjyg.managementservice.entity.gen.DictTypeExample;
import java.util.List;

public interface DictTypeMapper {
    long countByExample(DictTypeExample example);

    int deleteByPrimaryKey(Long dictTypeId);

    int insert(DictType record);

    int insertSelective(DictType record);

    List<DictType> selectByExample(DictTypeExample example);

    DictType selectByPrimaryKey(Long dictTypeId);

    int updateByPrimaryKeySelective(DictType record);

    int updateByPrimaryKey(DictType record);
}