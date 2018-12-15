package com.finacne.common.base.response;

/**
 * Des:
 * ClassName: LoginVo
 * Author: 1873130966@qq.com
 * Date: 2018/12/15
 * Time: 13:00
 */
public class LoginVo {
    private String token;

    private Long userUuid;

    private String userName;

    private Integer userType;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(Long userUuid) {
        this.userUuid = userUuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
