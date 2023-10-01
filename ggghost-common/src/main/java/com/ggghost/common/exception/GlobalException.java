package com.ggghost.common.exception;

/**
 * 全局异常
 */
public class GlobalException extends RuntimeException{
    private static final Long serialVersionId = 1L;
    /**
     * 错误提示
     */
    private String message;
    /**
     * 错误明细
     */
    private String detailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public GlobalException() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public GlobalException setMessage(String message) {
        this.message = message;
        return this;
    }
    public GlobalException setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }

    public String getDetailMessage() {
        return detailMessage;
    }
}
