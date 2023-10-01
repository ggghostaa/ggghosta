package com.ggghost.common.exception;

/**
 * @author ggghost
 * @create 2023/9/20 22:15
 */
public class ServiceException extends RuntimeException{
    private static final Long serialVersionUID = 1L;
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 错误信息详情
     */
    private String detailMessage;

    public ServiceException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    public ServiceException(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getDetailMessage() {
        return detailMessage;
    }
}
