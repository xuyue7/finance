package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKeyWithBLOBs(Role record);

    int updateByPrimaryKey(Role record);
}