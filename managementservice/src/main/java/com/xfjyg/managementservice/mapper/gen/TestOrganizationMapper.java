package com.xfjyg.managementservice.mapper.gen;

import com.xfjyg.managementservice.entity.gen.TestOrganization;
import com.xfjyg.managementservice.entity.gen.TestOrganizationExample;
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