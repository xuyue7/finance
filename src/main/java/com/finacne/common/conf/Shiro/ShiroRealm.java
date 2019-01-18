package com.finacne.common.conf.Shiro;

import com.finacne.modules.user.entity.SystemUser;
import com.finacne.modules.user.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Des:
 * ClassName: ShiroRealm
 * Author: 1873130966@qq.com
 * Date: 2018/12/11
 * Time: 10:31
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        //获取登录用户名
//        String name= (String) principalCollection.getPrimaryPrincipal();
//        //查询用户名称
//        SystemUser employee = this.userService.findByName(name);
//        //添加角色和权限
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        for (Role role:employee.getRoleList()) {
//            //添加角色
//            simpleAuthorizationInfo.addRole(role.getRoleCode());
//            for (Permission permission:role.getPermList()) {
//                //添加权限
//                simpleAuthorizationInfo.addStringPermission(permission.getPermissionCode());
//            }
//        }
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        //获取用户信息
        String name = authenticationToken.getPrincipal().toString();
        SystemUser user = this.userService.findByName(name);

        if (user == null) {
            //这里返回后会报出对应异常
            return null;
        } else {
            ByteSource salt = ByteSource.Util.bytes(user.getSuseRealName());
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name, user.getSusePassword(),salt, getName());
            return simpleAuthenticationInfo;
        }
    }
}
