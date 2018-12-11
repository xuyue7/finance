package com.finacne.modules.user.Mapper;

import com.finacne.modules.user.Entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKeyWithBLOBs(Role record);

    int updateByPrimaryKey(Role record);
}