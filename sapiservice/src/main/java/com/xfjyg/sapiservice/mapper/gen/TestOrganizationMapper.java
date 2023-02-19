package com.xfjyg.sapiservice.mapper.gen;

import com.xfjyg.sapiservice.entity.gen.TestOrganization;
import com.xfjyg.sapiservice.entity.gen.TestOrganizationExample;
import java.util.List;

public interface TestOrganizationMapper {
    long countByExample(TestOrganizationExample example);

    int deleteByPrimaryKey(Long testOrganizationId);

    int insert(TestOrganization record);

    int insertSelective(TestOrganization record);

    List<TestOrganization> selectByExample(TestOrganizationExample example);

    TestOrganization selectByPrimaryKey(Long testOrganizationId);

    int updateByPrimaryKeySelective(TestOrganization record);

    int updateByPrimaryKey(TestOrganization record);
}