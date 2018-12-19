package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.UserRole;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserRoleMapper extends Mapper<UserRole> {
    int deleteByPrimaryKey(Integer id);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}