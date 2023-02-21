package com.xfjyg.managementservice.mapper.gen;

import com.xfjyg.managementservice.entity.gen.Menu;
import com.xfjyg.managementservice.entity.gen.MenuExample;
import java.util.List;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}