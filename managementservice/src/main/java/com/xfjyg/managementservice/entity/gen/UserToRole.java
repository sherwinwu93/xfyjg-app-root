package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UserToRole")
public class UserToRole {
    @ApiModelProperty(value="userToRoleId用户to角色id")
    private Long userToRoleId;

    @ApiModelProperty(value="userId用户id")
    private Long userId;

    @ApiModelProperty(value="roleId角色id")
    private Long roleId;

    public Long getUserToRoleId() {
        return userToRoleId;
    }

    public void setUserToRoleId(Long userToRoleId) {
        this.userToRoleId = userToRoleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}