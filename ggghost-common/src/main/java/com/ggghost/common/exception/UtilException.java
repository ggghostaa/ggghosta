package com.ggghost.common.exception;

/**
 * @author ggghost
 * @create 2023/9/20 22:20
 */
public class UtilException extends RuntimeException{
    public UtilException(Throwable e) {
        super(e.getMessage(), e);
    }

    public UtilException(String message) {
        super(message);
    }

    public UtilException(String message, Throwable cause) {
        super(message, cause);
    }
}
