package com.xfjyg.managementservice.mapper.gen;

import com.xfjyg.managementservice.entity.gen.DictItem;
import com.xfjyg.managementservice.entity.gen.DictItemExample;
import java.util.List;

public interface DictItemMapper {
    long countByExample(DictItemExample example);

    int deleteByPrimaryKey(Long dictItemId);

    int insert(DictItem record);

    int insertSelective(DictItem record);

    List<DictItem> selectByExample(DictItemExample example);

    DictItem selectByPrimaryKey(Long dictItemId);

    int updateByPrimaryKeySelective(DictItem record);

    int updateByPrimaryKey(DictItem record);
}