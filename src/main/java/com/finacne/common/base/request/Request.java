package com.finacne.common.base.request;

/**
 * Des:
 * ClassName: Request
 * Author: 1873130966@qq.com
 * Date: 2018/12/15
 * Time: 13:01
 */
public class Request<T> {
    private Integer pageNum;
    private Integer pageSize;
    private String version;
    private String token;

    private T params;

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
