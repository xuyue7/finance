package com.finacne.modules.user.Mapper;

import com.finacne.modules.user.Entity.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}