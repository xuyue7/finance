package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.Role;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface RoleMapper extends Mapper<Role> {
    int deleteByPrimaryKey(Integer id);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKeyWithBLOBs(Role record);

    int updateByPrimaryKey(Role record);
}