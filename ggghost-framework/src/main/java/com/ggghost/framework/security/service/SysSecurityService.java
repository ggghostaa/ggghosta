package com.ggghost.framework.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SysSecurityService {
    @Autowired
    RedisCache redisCache;

}
