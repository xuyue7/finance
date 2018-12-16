package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}