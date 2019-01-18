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

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: xuyue
 * @Date: 18-11-25 22:15
 * @Description:
 * @ClassName:TestController
 */
@Controller
@RequestMapping(value = "/test")
@Api(description = "财务凭证页面控制器ProofController",value = "",tags = "ProofController")
public class ProofController {
}
