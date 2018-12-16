package com.finacne.modules.user.entity;

import java.util.Date;
import java.util.List;

public class Role {
    private Integer id;

    private Long roleId;

    private String roleTitle;

    private String roleCode;

    private Date createTime;

    private Integer roleDescribe;

    private List<Permission> permList;

    public List<Permission> getPermList() {
        return permList;
    }

    public void setPermList(List<Permission> permList) {
        this.permList = permList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle == null ? null : roleTitle.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(Integer roleDescribe) {
        this.roleDescribe = roleDescribe;
    }
}