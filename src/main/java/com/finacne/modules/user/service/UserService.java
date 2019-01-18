package com.finacne.modules.user.service;

import com.finacne.common.base.request.Request;
import com.finacne.modules.user.entity.Response.UserDataParams;
import com.finacne.modules.user.entity.SystemUser;
import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.entity.request.SearchUInfParams;
import com.github.pagehelper.PageInfo;

/**
 * @author xuyue
 * @package com.finacne.modules.employee.service
 * @name UserService
 * @describe:
 * @date 2018/12/6
 */
public interface UserService {
    /**
     * 查询用户
     *
     * @param name
     * @return
     */
    SystemUser findByName(String name);

    /**
     * 查询用户进行分页
     *
     * @param request
     * @return
     */
    PageInfo<UserInfo> findUserInfo(Request<SearchUInfParams> request);

    /**
     * 查询员工数据并分页
     *
     * @param request
     * @return
     */
    PageInfo<UserInfo> selectAllUserInfo(Request<UserDataParams> request);

    /**
     * 查询系统用户并进行分页
     *
     * @param params
     * @return
     */
    PageInfo<SystemUser> selectAllAdminInfo(Request<UserDataParams> params);
}
