package com.finacne.common.base.response;

/**
 * Des:
 * ClassName: Response
 * Author: 1873130966@qq.com
 * Date: 2018/12/15
 * Time: 13:08
 */
public class Response {
    private String msg;

    private Integer status;

    private String token;

    public Response(String msg, Integer status, String token) {
        this.msg = msg;
        this.status = status;
        this.token = token;
    }

    public Response() {

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static Response ResponseOK(String msg, String token){
        return new Response(msg,HttpStatus.OK,token);
    }

    public static Response ResponseBAD(String msg, String token){
        return new Response(msg,HttpStatus.BAD,token);
    }

}
