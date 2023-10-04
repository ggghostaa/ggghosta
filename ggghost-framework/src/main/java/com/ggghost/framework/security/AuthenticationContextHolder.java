package com.ggghost.framework.security;

import org.springframework.security.core.Authentication;

/**
 * 存储、移除、获取身份验证
 */
public class AuthenticationContextHolder {
    private static final ThreadLocal<Authentication> contextHolder = new ThreadLocal<>();

    public static void setContext(Authentication authentication) {
        contextHolder.set(authentication);
    }

    public static Authentication getContext() {
        return contextHolder.get();
    }
    public static void remove() {
        contextHolder.remove();
    }

}
