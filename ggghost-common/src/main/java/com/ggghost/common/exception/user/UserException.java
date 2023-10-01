package com.ggghost.common.exception.user;

import com.ggghost.common.exception.base.BaseException;

/**
 * @author ggghost
 * @create 2023/9/20 22:30
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;
    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
