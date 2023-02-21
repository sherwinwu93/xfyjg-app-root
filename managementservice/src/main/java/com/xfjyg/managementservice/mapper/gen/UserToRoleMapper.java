package com.xfjyg.managementservice.mapper.gen;

import com.xfjyg.managementservice.entity.gen.UserToRole;
import com.xfjyg.managementservice.entity.gen.UserToRoleExample;
import java.util.List;

public interface UserToRoleMapper {
    long countByExample(UserToRoleExample example);

    int deleteByPrimaryKey(Long userToRoleId);

    int insert(UserToRole record);

    int insertSelective(UserToRole record);

    List<UserToRole> selectByExample(UserToRoleExample example);

    UserToRole selectByPrimaryKey(Long userToRoleId);

    int updateByPrimaryKeySelective(UserToRole record);

    int updateByPrimaryKey(UserToRole record);
}