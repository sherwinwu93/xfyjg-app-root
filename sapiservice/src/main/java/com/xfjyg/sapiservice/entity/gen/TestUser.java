package com.xfjyg.sapiservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.xfjyg.sapiservice.entity.gen.TestUser")
public class TestUser {
    @ApiModelProperty(value="testUserId")
    private Long testUserId;

    @ApiModelProperty(value="username")
    private String username;

    @ApiModelProperty(value="password")
    private String password;

    @ApiModelProperty(value="testOrgId")
    private Long testOrgId;

    @ApiModelProperty(value="status")
    private Integer status;

    public Long getTestUserId() {
        return testUserId;
    }

    public void setTestUserId(Long testUserId) {
        this.testUserId = testUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getTestOrgId() {
        return testOrgId;
    }

    public void setTestOrgId(Long testOrgId) {
        this.testOrgId = testOrgId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}