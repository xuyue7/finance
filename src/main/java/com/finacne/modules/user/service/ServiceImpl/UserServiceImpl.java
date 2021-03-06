package com.finacne.modules.user.service.ServiceImpl;

import com.finacne.common.base.request.Request;
import com.finacne.modules.user.entity.Response.UserDataParams;
import com.finacne.modules.user.entity.SystemUser;
import com.finacne.modules.user.entity.UserInfo;
import com.finacne.modules.user.entity.request.SearchUInfParams;
import com.finacne.modules.user.mapper.SystemUserMapper;
import com.finacne.modules.user.mapper.UserInfoMapper;
import com.finacne.modules.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuyue
 * @package com.finacne.modules.employee.service.ServiceImpl
 * @name UserServiceImpl
 * @describe:
 * @date 2018/12/6
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private SystemUserMapper systemUserMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 通过用户名查询SystemUser
     *
     * @param name
     * @return
     */
    @Override
    public SystemUser findByName(String name) {
        SystemUser systemUser = new SystemUser();
        systemUser.setSuseRealName(name);
        return this.systemUserMapper.selectOne(systemUser);
    }

    /**
     * 差查用户信息
     *
     * @param request
     * @return
     */
    @Override
    public PageInfo<UserInfo> findUserInfo(Request<SearchUInfParams> request) {
        SearchUInfParams params = request.getParams();
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
//        List<UserInfo> uinfList = this.userInfoMapper.search(params);
        List<UserInfo> uinfList = this.userInfoMapper.selectAll();
        return new PageInfo<>(uinfList);
    }

    /**
     * 查询所有用户信息
     *
     * @param params
     * @return
     */
    @Override
    public PageInfo<UserInfo> selectAllUserInfo(Request<UserDataParams> params) {
        UserInfo userInfo = new UserInfo();
        userInfo.setDataStatus(0);
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        return new PageInfo<UserInfo>(this.userInfoMapper.select(userInfo));
    }

    /**
     * 查询系统用户并进行分页
     *
     * @param params
     * @return
     */
    @Override
    public PageInfo<SystemUser> selectAllAdminInfo(Request<UserDataParams> params) {
        PageHelper.startPage(params.getPageNum(),params.getPageNum());
        return new PageInfo<>(this.systemUserMapper.selectAll());
    }
}
