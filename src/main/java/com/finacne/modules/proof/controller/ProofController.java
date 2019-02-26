/*
 * *
 * All Rights Reserved.FileName: TestController.java
 * @author: jack
 * @date: 18-11-25 下午10:15
 * @version: 1.0
 * describe: Shall not be reproduced without consent
 * /
 */

package com.finacne.modules.proof.controller;

import com.finacne.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: xuyue
 * @Date: 18-11-25 22:15
 * @Description:
 * @ClassName:TestController
 */
@Controller
@RequestMapping(value = "/proof", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
@Api(description = "财务凭证页面控制器ProofController", value = "", tags = "ProofController")
public class ProofController extends BaseController {

    @ApiOperation(value = "新增凭证页面", notes = "", tags = "新增凭证页面")
    @RequestMapping(value = "/add/view", method = RequestMethod.GET)
    public String addProofView() {
        return "/views/proof/addproof";
    }

    @ApiOperation(value = "查看凭证页面", notes = "", tags = "查看凭证页面")
    @RequestMapping(value = "/see/view", method = RequestMethod.GET)
    public String seeProofView() {
        return "/views/proof/seeproof";
    }
}
