package com.finacne.modules.user.controller;

import com.finacne.common.base.BaseController;
import com.finacne.common.base.request.Request;
import com.finacne.common.base.response.LayuiResponse;
import com.finacne.common.base.response.Response;
import com.finacne.modules.user.entity.Response.UserDataParams;
import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Des:
 * ClassName: UserDataController
 * Author: 1873130966@qq.com
 * Date: 2019/01/15
 * Time: 09:23
 */
@Api(description = "用户数据控制器", tags = "用户页面")
@Controller
@RequestMapping(value = "/user/data", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
public class UserDataController extends BaseController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户数据数据", notes = "")
    @RequestMapping(value = "/info")
    @ResponseBody
    public Map<String, Object> userInfo(Request<UserDataParams> request) {
        List<UserInfo> userInfoList = this.userService.selectAllUserInfo();
        return Response.OK(15,userInfoList);
    }

}
