package com.finacne.common.base.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Des:
 * ClassName: LayuiResponse
 * Author: 1873130966@qq.com
 * Date: 2018/12/16
 * Time: 12:44
 */
public class LayuiResponse extends Response {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public static Response layuiResponseOK(Integer count, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", data);
        return new Response(count,data);
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
