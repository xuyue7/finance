package com.finacne.modules.test.mapper;

import com.finacne.modules.test.entity.Chat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ChatMapper extends tk.mybatis.mapper.common.Mapper<Chat> {
    int insert(Chat record);

    int insertSelective(Chat record);

    List<Chat> selectAll();
}