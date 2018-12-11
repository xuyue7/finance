package com.finacne.modules.user.Service.ServiceImpl;

import com.finacne.modules.user.Entity.SystemUser;
import com.finacne.modules.user.Mapper.SystemUserMapper;
import com.finacne.modules.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuyue
 * @package com.finacne.modules.user.Service.ServiceImpl
 * @name UserServiceImpl
 * @describe:
 * @date 2018/12/6
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SystemUserMapper systemUserMapper;
    @Override
    public SystemUser findByName(String name) {
        SystemUser systemUser = new SystemUser();
        systemUser.setUserName(name);
        systemUser.setUserStatus(0);
        systemUser.setUserDataStatus(0);
        return this.systemUserMapper.selectOne(systemUser);
    }
}
