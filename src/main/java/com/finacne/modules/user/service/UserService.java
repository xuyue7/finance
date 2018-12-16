package com.finacne.modules.user.service;

import com.finacne.common.base.request.Request;
import com.finacne.modules.user.entity.SystemUser;
import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.entity.request.SearchUInfParams;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

/**
 * @author xuyue
 * @package com.finacne.modules.user.service
 * @name UserService
 * @describe:
 * @date 2018/12/6
 */
@Service("userService")
public interface UserService {
    /**
     * 查询用户
     * @param name
     * @return
     */
    SystemUser findByName(String name);

    /**
     * 查询用户进行分页
     * @param request
     * @return
     */
    PageInfo<UserInfo> findUserInfo(Request<SearchUInfParams> request);
}
