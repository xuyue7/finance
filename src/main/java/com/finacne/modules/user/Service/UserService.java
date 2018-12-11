package com.finacne.modules.user.Service;

import com.finacne.modules.user.Entity.SystemUser;
import org.springframework.stereotype.Service;

/**
 * @author xuyue
 * @package com.finacne.modules.user.Service
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
}
