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
public class LayuiResponse {
    private Integer code;
    private String msg;
    private Long count;
    private Object data;

    public static Map<String,Object> layuiResponseOK(Long count, Object data) {
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",data);
        return map;
    }
}
