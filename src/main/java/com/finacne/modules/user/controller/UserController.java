package com.finacne.modules.user.controller;

import com.finacne.common.base.BaseController;
import com.finacne.common.base.request.LoginParams;
import com.finacne.common.base.request.Request;
import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.entity.request.SearchUInfParams;
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

@Api(description = "登录检查", value = "UserController", tags = "用户页面")
@Controller
@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
public class UserController extends BaseController {

    @ApiOperation(value = "用户登录页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/login/view")
    public String loginView() {
        return "/login";
    }

    @ApiOperation(value = "用户登录成功页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/login/index", method = RequestMethod.GET)
    public String loginSucessView() {
        return "views/index";
    }

    @ApiOperation(value = "用户登录成功页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/admin/view", method = RequestMethod.GET)
    public String adminView() {
        return "views/user/administrators/list";
    }

    @ApiOperation(value = "用户登录成功页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/employee/view", method = RequestMethod.GET)
    public String userView() {
        return "views/user/employee/list";
    }

}












