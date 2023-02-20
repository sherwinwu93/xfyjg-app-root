package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="com.xfjyg.managementservice.entity.gen.TestResource")
public class TestResource {
    @ApiModelProperty(value="xhResourceId")
    private Long xhResourceId;

    @ApiModelProperty(value="userId")
    private Long userId;

    @ApiModelProperty(value="resourceName")
    private String resourceName;

    @ApiModelProperty(value="state")
    private Integer state;

    @ApiModelProperty(value="createTime")
    private Date createTime;

    @ApiModelProperty(value="updateTime")
    private Date updateTime;

    public Long getXhResourceId() {
        return xhResourceId;
    }

    public void setXhResourceId(Long xhResourceId) {
        this.xhResourceId = xhResourceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}