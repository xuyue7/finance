package com.finacne.modules.user.entity;

import java.util.Date;

public class SystemUser {
    private Long id;

    private Long suseUuid;

    private Long suseMallUuid;

    private Long suseDepaUuid;

    private String suseUserName;

    private String suseRealName;

    private String suseNikeName;

    private String susePassword;

    private String suseOnlineTag;

    private String suseClientSalt;

    private String suseHead;

    private Integer suseSex;

    private Date suseBirthday;

    private String susePhone;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSuseUuid() {
        return suseUuid;
    }

    public void setSuseUuid(Long suseUuid) {
        this.suseUuid = suseUuid;
    }

    public Long getSuseMallUuid() {
        return suseMallUuid;
    }

    public void setSuseMallUuid(Long suseMallUuid) {
        this.suseMallUuid = suseMallUuid;
    }

    public Long getSuseDepaUuid() {
        return suseDepaUuid;
    }

    public void setSuseDepaUuid(Long suseDepaUuid) {
        this.suseDepaUuid = suseDepaUuid;
    }

    public String getSuseUserName() {
        return suseUserName;
    }

    public void setSuseUserName(String suseUserName) {
        this.suseUserName = suseUserName == null ? null : suseUserName.trim();
    }

    public String getSuseRealName() {
        return suseRealName;
    }

    public void setSuseRealName(String suseRealName) {
        this.suseRealName = suseRealName == null ? null : suseRealName.trim();
    }

    public String getSuseNikeName() {
        return suseNikeName;
    }

    public void setSuseNikeName(String suseNikeName) {
        this.suseNikeName = suseNikeName == null ? null : suseNikeName.trim();
    }

    public String getSusePassword() {
        return susePassword;
    }

    public void setSusePassword(String susePassword) {
        this.susePassword = susePassword == null ? null : susePassword.trim();
    }

    public String getSuseOnlineTag() {
        return suseOnlineTag;
    }

    public void setSuseOnlineTag(String suseOnlineTag) {
        this.suseOnlineTag = suseOnlineTag == null ? null : suseOnlineTag.trim();
    }

    public String getSuseClientSalt() {
        return suseClientSalt;
    }

    public void setSuseClientSalt(String suseClientSalt) {
        this.suseClientSalt = suseClientSalt == null ? null : suseClientSalt.trim();
    }

    public String getSuseHead() {
        return suseHead;
    }

    public void setSuseHead(String suseHead) {
        this.suseHead = suseHead == null ? null : suseHead.trim();
    }

    public Integer getSuseSex() {
        return suseSex;
    }

    public void setSuseSex(Integer suseSex) {
        this.suseSex = suseSex;
    }

    public Date getSuseBirthday() {
        return suseBirthday;
    }

    public void setSuseBirthday(Date suseBirthday) {
        this.suseBirthday = suseBirthday;
    }

    public String getSusePhone() {
        return susePhone;
    }

    public void setSusePhone(String susePhone) {
        this.susePhone = susePhone == null ? null : susePhone.trim();
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