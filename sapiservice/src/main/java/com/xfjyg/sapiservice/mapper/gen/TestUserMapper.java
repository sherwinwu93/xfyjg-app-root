package com.xfjyg.sapiservice.mapper.gen;

import com.xfjyg.sapiservice.entity.gen.TestUser;
import com.xfjyg.sapiservice.entity.gen.TestUserExample;
import java.util.List;

public interface TestUserMapper {
    long countByExample(TestUserExample example);

    int deleteByPrimaryKey(Long testUserId);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    List<TestUser> selectByExample(TestUserExample example);

    TestUser selectByPrimaryKey(Long testUserId);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}