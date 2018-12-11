package com.finacne.modules.user.Mapper;

import com.finacne.modules.user.Entity.RolePremission;

public interface RolePremissionMapper {
    int deleteByPrimaryKey(Integer id);

    RolePremission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePremission record);

    int updateByPrimaryKey(RolePremission record);
}