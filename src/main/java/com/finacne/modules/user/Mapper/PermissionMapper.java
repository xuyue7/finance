package com.finacne.modules.user.Mapper;

import com.finacne.modules.user.Entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}