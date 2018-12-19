package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionMapper extends tk.mybatis.mapper.common.Mapper<Permission> {
    int deleteByPrimaryKey(Integer id);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}