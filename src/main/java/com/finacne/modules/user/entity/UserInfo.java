package com.finacne.modules.user.entity;

import java.util.Date;

public class UserInfo {
    private Integer id;

    private Long uinfUuid;

    private String uinfName;

    private Integer uinfSex;

    private Date uinfBirth;

    private String uinfAddr;

    private Integer dataStatus;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUinfUuid() {
        return uinfUuid;
    }

    public void setUinfUuid(Long uinfUuid) {
        this.uinfUuid = uinfUuid;
    }

    public String getUinfName() {
        return uinfName;
    }

    public void setUinfName(String uinfName) {
        this.uinfName = uinfName == null ? null : uinfName.trim();
    }

    public Integer getUinfSex() {
        return uinfSex;
    }

    public void setUinfSex(Integer uinfSex) {
        this.uinfSex = uinfSex;
    }

    public Date getUinfBirth() {
        return uinfBirth;
    }

    public void setUinfBirth(Date uinfBirth) {
        this.uinfBirth = uinfBirth;
    }

    public String getUinfAddr() {
        return uinfAddr;
    }

    public void setUinfAddr(String uinfAddr) {
        this.uinfAddr = uinfAddr == null ? null : uinfAddr.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}