package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface SystemUserMapper extends tk.mybatis.mapper.common.Mapper<SystemUser> {
    /**
     * 查询用户
     * @param name
     * @return
     */
    SystemUser selectOneByUserName(String name);
}