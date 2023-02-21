package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="Dept")
public class Dept {
    @ApiModelProperty(value="deptId部门id")
    private Long deptId;

    @ApiModelProperty(value="parentId父部门id")
    private Long parentId;

    @ApiModelProperty(value="path祖级列表")
    private String path;

    @ApiModelProperty(value="deptName部门名称")
    private String deptName;

    @ApiModelProperty(value="orderNum显示顺序")
    private Integer orderNum;

    @ApiModelProperty(value="state")
    private Boolean state;

    @ApiModelProperty(value="createTime")
    private Date createTime;

    @ApiModelProperty(value="updateTime")
    private Date updateTime;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
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