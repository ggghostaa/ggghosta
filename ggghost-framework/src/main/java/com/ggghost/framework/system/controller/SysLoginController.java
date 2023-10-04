package com.ggghost.framework.system.controller;

import com.ggghost.common.core.domain.AjaxResult;
import com.ggghost.common.core.domain.model.LoginBody;
import com.ggghost.framework.system.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ggghost
 * @create 2023/9/24 22:18
 */
@Controller
public class SysLoginController {
    @Autowired
    SysLoginService sysLoginService;

    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody) {
        //生成令牌
        String token = sysLoginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(), loginBody.getUuid());
        AjaxResult ajax = new AjaxResult();
        ajax.put("token", token);
        return ajax;
    }

}
