package com.finacne.modules.user.controller;

import com.finacne.common.base.BaseController;
import com.finacne.common.base.request.LoginParams;
import com.finacne.common.base.request.Request;
import com.finacne.common.base.response.LayuiResponse;
import com.finacne.common.base.response.Response;
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
@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
public class UserController extends BaseController {
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

    @ApiOperation(value = "用户数据", notes = "", tags = "用户数据")
    @RequestMapping(value = "/data", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> userData(Request<SearchUInfParams> request) {
        PageInfo<UserInfo> pageInfo = this.userService.findUserInfo(request);
        Map<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count", pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        return result;
    }

    @ApiOperation(value = "用户登录页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/login/view")
    public String loginView() {
        return "/login";
    }

    @ApiOperation(value = "用户登录成功页面", notes = "", tags = "用户登录页面")
    @RequestMapping(value = "/login/index")
    public String loginSucessView() {
        return "/views/index";
    }

}












