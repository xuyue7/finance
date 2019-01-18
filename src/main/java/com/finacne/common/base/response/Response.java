package com.finacne.common.base.response;

import java.util.HashMap;
import java.util.Map;

/**
 * Des:
 * ClassName: Response
 * Author: 1873130966@qq.com
 * Date: 2018/12/15
 * Time: 13:08
 */
public class Response {

    private Integer code;
    private String msg;
    private Long count;
    private Object data;

    private static Map<String, Object> map;

    public Response(Long count, Object data) {
        this.count = count;
        this.data = data;
    }

    public static Map<String, Object> Layui(Integer count, Object data) {
        return map;
    }

    public static Map<String, Object> OK(Long count, Object data) {
        return map;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
