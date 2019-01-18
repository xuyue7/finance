package com.finacne.modules.user.controller;

import com.finacne.common.base.BaseController;
import com.finacne.common.base.request.LoginParams;
import com.finacne.common.base.request.Request;
import com.finacne.modules.user.entity.Response.UserDataParams;
import com.finacne.modules.user.entity.SystemUser;
import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Des:
 * ClassName: UserDataController
 * Author: 1873130966@qq.com
 * Date: 2019/01/15
 * Time: 09:23
 */
@Api(description = "用户数据控制器UserDataController", tags = "用户页面")
@Controller
@RequestMapping(value = "/user/data", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
public class UserDataController extends BaseController {
    @Autowired
    private UserService userService;

    //post登录
    @ApiOperation(value = "登录数据验证", notes = "")
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String login(@RequestBody @Valid Request<LoginParams> request) {
        //添加用户认证信息
        LoginParams params = request.getParams();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(params.getUsername(), params.getPwd());
        //进行验证，这里可以捕获异常，然后返回对应信息
        try {
            subject.login(usernamePasswordToken);
            log.info("开始验证");
            // 判断当前用户是否登录
            if (subject.isAuthenticated() == true) {
                return "/windows/index";
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "/login";
        }
        return "/windows/index";
    }

    @ApiOperation(value = "员工数据控制器", notes = "")
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> userInfo(Request<UserDataParams> request) {
        Request<UserDataParams> params = request;
        PageInfo<UserInfo> pageInfo = this.userService.selectAllUserInfo(params);
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        map.put("msg","");
        return map;
    }

    @ApiOperation(value = "用户数据控制器", notes = "")
    @RequestMapping(value = "/admin/info",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> adminInfo(Request<UserDataParams> request) {
        Request<UserDataParams> params = request;
        PageInfo<SystemUser> pageInfo = this.userService.selectAllAdminInfo(params);
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        map.put("msg","");
        return map;
    }

}
