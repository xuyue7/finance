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

import com.finacne.modules.test.entity.Chat;
import com.finacne.modules.test.entity.Student.Student;
import com.finacne.modules.test.service.serviceimpl.TestServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: xuyue
 * @Date: 18-11-25 22:15
 * @Description:
 * @ClassName:TestController
 */
@Controller
@RequestMapping(value = "/test")
@Api(description = "122",value = "TestController",tags = "1徐月")
public class TestController {
    @Autowired
    private TestServiceImpl testServiceImpl;

    @ApiOperation(value = "数据",notes = "查询摸个至")
    @RequestMapping("index")
    public String printTset(){
        return "index";
    }

    @RequestMapping(value = "/dat")
    @ResponseBody
    @ApiOperation(value = "数据",notes = "查询摸个至")
    public Map<Object,Object> printData(){
        Map<Object,Object> map = new HashMap<>();
        List<Chat> chatList = this.testServiceImpl.selectAll();
        map.put("data",chatList);
        return map;
    }

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable int id) {
        System.out.println("开始查询");
        return null;
    }
}
