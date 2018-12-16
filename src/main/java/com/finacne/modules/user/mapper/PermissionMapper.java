package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}