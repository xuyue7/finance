/*
 * *
 * All Rights Reserved.FileName: TestController.java
 * @author: jack
 * @date: 18-11-25 下午10:15
 * @version: 1.0
 * describe: Shall not be reproduced without consent
 * /
 */

package com.finacne.modules.test.controller;

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
public class TestController {
    public String printTset(){
        return "index";
    }
}
