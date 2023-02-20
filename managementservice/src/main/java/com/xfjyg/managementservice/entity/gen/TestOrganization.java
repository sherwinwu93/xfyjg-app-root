package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.xfjyg.managementservice.entity.gen.TestOrganization")
public class TestOrganization {
    @ApiModelProperty(value="testOrganizationId")
    private Long testOrganizationId;

    @ApiModelProperty(value="organizationName")
    private String organizationName;

    public Long getTestOrganizationId() {
        return testOrganizationId;
    }

    public void setTestOrganizationId(Long testOrganizationId) {
        this.testOrganizationId = testOrganizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }
}