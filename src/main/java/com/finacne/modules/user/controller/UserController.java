package com.finacne.modules.user.controller;

import com.finacne.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(description = "登录检查", value = "UserController", tags = "用户页面")
@Controller
@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
public class UserController extends BaseController {

    @ApiOperation(value = "用户登录页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/login/view")
    public String loginView() {
        return "/login";
    }

    @ApiOperation(value = "用户登录成功页面", notes = "", tags = "用户登录成功页面")
    @RequestMapping(value = "/login/index", method = RequestMethod.GET)
    public String loginSucessView() {
        return "views/index";
    }

    @ApiOperation(value = "管理员页面", notes = "", tags = "管理管理员页面")
    @RequestMapping(value = "/admin/view", method = RequestMethod.GET)
    public String adminView() {
        return "views/user/administrators/list";
    }

    @ApiOperation(value = "员工页面", notes = "", tags = "员工管理页面")
    @RequestMapping(value = "/employee/view", method = RequestMethod.GET)
    public String userView() {
        return "views/user/employee/list";
    }

}












