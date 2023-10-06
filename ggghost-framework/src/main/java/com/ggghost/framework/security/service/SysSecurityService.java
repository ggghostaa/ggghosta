package com.ggghost.framework.security.service;

import com.ggghost.common.constant.CacheConstants;
import com.ggghost.common.core.redis.RedisCache;
import com.ggghost.framework.security.AuthenticationContextHolder;
import com.ggghost.framework.system.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class SysSecurityService {

    @Value(value = "5")
    private int maxRetryCount;

    @Value(value = "10")
    private int lockTime;

    @Autowired(required = false)
    private RedisCache redisCache;

    public void validate(SysUser sysUser) {
        Authentication usernamePasswordAuthentication = AuthenticationContextHolder.getContext();
        String name = usernamePasswordAuthentication.getName();
        String password = usernamePasswordAuthentication.getCredentials().toString();

        Integer retryCount = redisCache.getCacheObject(getCacheKey(name));

        if (retryCount == null) retryCount = 0;
        if (retryCount >= maxRetryCount) {

        }
    }

    private String getCacheKey(String name) {
        return CacheConstants.PWD_ERR_CNT_KEY + name;
    }



}
