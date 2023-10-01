package com.ggghost.common.exception.user;

/**
 * @author ggghost
 * @create 2023/9/20 22:37
 */
public class CaptchaException extends UserException{
    private static final Long serialVersionUID = 1L;
    public CaptchaException() {
        super("user.jcaptcha.error", null);
    }
}
