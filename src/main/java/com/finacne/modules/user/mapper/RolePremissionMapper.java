package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.RolePremission;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface RolePremissionMapper extends Mapper<RolePremission> {
    int deleteByPrimaryKey(Integer id);

    RolePremission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePremission record);

    int updateByPrimaryKey(RolePremission record);
}