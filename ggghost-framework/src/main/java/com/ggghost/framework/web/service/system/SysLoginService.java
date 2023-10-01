package com.ggghost.framework.web.service.system;

import com.ggghost.common.core.domain.model.LoginBody;
import org.springframework.stereotype.Component;

/**
 * @author ggghost
 * @create 2023/9/24 22:34
 */
@Component
public class SysLoginService {
    public String login(String username, String password, String code, String uuid) {
        //验证码校验
        validateCaptcha(username, code, uuid);
        //登录前置验证
        loginPreCheck(username, password);

        //用户验证

    }
}
