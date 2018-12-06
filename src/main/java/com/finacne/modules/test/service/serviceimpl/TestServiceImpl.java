/*
 * *
 * All Rights Reserved.FileName: TestServiceImpl.java
 * @author: jack
 * @date: 18-11-25 下午9:41
 * @version: 1.0
 * describe: Shall not be reproduced without consent
 * /
 */

package com.finacne.modules.test.service.serviceimpl;

import com.finacne.modules.test.entity.Chat;
import com.finacne.modules.test.mapper.ChatMapper;
import com.finacne.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: xuyue
 * @Date: 18-11-25 21:41
 * @Description:这是测试类
 * @ClassName:TestServiceImpl
 */

@Service(value = "testServiceImpl")
public class TestServiceImpl implements TestService {
    @Autowired
    private ChatMapper chatMapper;

    @Override
    public List<Chat> selectAll() {
//        return this.chatMapper.selectAll();
        return this.chatMapper.selectAll();
    }
}













