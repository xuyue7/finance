package com.finacne.modules.user.Entity;

import java.util.Date;

public class RolePremission {
    private Integer id;

    private Long rolePremId;

    private Long roleId;

    private Long premId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getRolePremId() {
        return rolePremId;
    }

    public void setRolePremId(Long rolePremId) {
        this.rolePremId = rolePremId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPremId() {
        return premId;
    }

    public void setPremId(Long premId) {
        this.premId = premId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}