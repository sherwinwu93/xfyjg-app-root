package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

@ApiModel(value="User")
public class User {
    @ApiModelProperty(value="userId")
    private Long userId;

    @ApiModelProperty(value="username")
    private String username;

    @ApiModelProperty(value="password")
    private String password;

    @ApiModelProperty(value="realname")
    private String realname;

    @ApiModelProperty(value="phone")
    private String phone;

    @ApiModelProperty(value="deptId")
    private Long deptId;

    @ApiModelProperty(value="state")
    private Boolean state;

    @ApiModelProperty(value="createTime")
    private Date createTime;

    @ApiModelProperty(value="updateTime")
    private Date updateTime;

    @ApiModelProperty(value="status")
    private Byte status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}