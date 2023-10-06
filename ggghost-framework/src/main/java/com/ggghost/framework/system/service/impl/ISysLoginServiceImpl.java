package com.ggghost.framework.system.service.impl;

import com.ggghost.framework.system.service.ISysLoginService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @author ggghost
 * @create 2023/9/24 22:34
 */
@Component
public class ISysLoginServiceImpl implements ISysLoginService {

    public String login(String username, String password, String code, String uuid) {
        //验证码校验
        validateCaptcha(username, code, uuid);
        //登录前置验证
        loginPreCheck(username, password);
        //用户验证
        Authentication authentication = null;

        UsernamePasswordAuthenticationToken authenticationToke = new UsernamePasswordAuthenticationToken(username, password);
        return null;


    }

    //登陆前置验证
    private void loginPreCheck(String username, String password) {
    }
    //校验码验证
    private void validateCaptcha(String username, String code, String uuid) {
    }
}
