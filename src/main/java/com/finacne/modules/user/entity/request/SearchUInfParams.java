package com.finacne.modules.user.entity.request;

import java.util.Date;

/**
 * Des:
 * ClassName: SearcUInfParams
 * Author: 1873130966@qq.com
 * Date: 2018/12/16
 * Time: 12:52
 */
public class SearchUInfParams {

    private String uinfName;

    private Integer uinfSex;

    private String uinfAddr;

    private Integer dataStatus;

    public String getUinfName() {
        return uinfName;
    }

    public void setUinfName(String uinfName) {
        this.uinfName = uinfName;
    }

    public Integer getUinfSex() {
        return uinfSex;
    }

    public void setUinfSex(Integer uinfSex) {
        this.uinfSex = uinfSex;
    }

    public String getUinfAddr() {
        return uinfAddr;
    }

    public void setUinfAddr(String uinfAddr) {
        this.uinfAddr = uinfAddr;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
}
