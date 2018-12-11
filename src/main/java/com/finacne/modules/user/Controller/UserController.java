package com.finacne.modules.user.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(description = "登录检查",value = "UserController",tags = "用户页面")
@Controller
public class UserController {
    //post登录
    @ApiOperation(value = "登录数据验证", notes = "")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password) {
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        //进行验证，这里可以捕获异常，然后返回对应信息
        try {
            subject.login(usernamePasswordToken);
            System.out.println("验证成功");
            // 判断当前用户是否登录
            if (subject.isAuthenticated() == true) {
                return "src/index";
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登录失败");
            return "src/login";
        }
        return "src/index";
    }

    /**
     * 登陆页面
     * @param model
     * @return
     */
    @ApiOperation(value = "登陆页面", notes = "")
    @RequestMapping(value = "/login/view")
    public String loginView(Model model) {
        return "src/login";
    }

}
