package com.finacne.modules.user.Controller;

import com.finacne.common.base.BaseController;
import com.finacne.common.base.request.LoginParams;
import com.finacne.common.base.request.Request;
import com.finacne.common.base.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Api(description = "登录检查", value = "UserController", tags = "用户页面")
@Controller
public class UserController extends BaseController {
    //post登录
    @ApiOperation(value = "登录数据验证", notes = "")
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Response login(@RequestBody @Valid Request<LoginParams> request) {
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
                return Response.ResponseOK("你已经登录", "");
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return Response.ResponseBAD("登录失败", "");
        }
        return Response.ResponseOK("你已成功登录", "");
    }

}
