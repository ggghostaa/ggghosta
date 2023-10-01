package com.ggghost.common.exception.user;

/**
 * 黑名单ip异常错误
 * @author ggghost
 * @create 2023/9/20 22:34
 */
public class BlackListException extends UserException{
    private static final Long serialVersionUID = 1L;
    public BlackListException() {
        super("longin.blocked", null);
    }
}
