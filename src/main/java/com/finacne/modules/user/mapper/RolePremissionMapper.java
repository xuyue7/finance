package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.RolePremission;

public interface RolePremissionMapper {
    int deleteByPrimaryKey(Integer id);

    RolePremission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePremission record);

    int updateByPrimaryKey(RolePremission record);
}