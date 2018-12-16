package com.finacne.modules.user.mapper;

import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.entity.request.SearchUInfParams;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Component
public interface UserInfoMapper extends Mapper<UserInfo> {
    /**
     * 分页查询用户信息
     * @param params
     * @return
     */
    List<UserInfo> search(SearchUInfParams params);
}