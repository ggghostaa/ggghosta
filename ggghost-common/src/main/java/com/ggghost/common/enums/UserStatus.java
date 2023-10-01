package com.ggghost.common.enums;

/**
 * 用户状态
 * @author ggghost
 * @create 2023/9/20 22:53
 */
public enum UserStatus {
    OK("0", "正常"), DISABLE("1", "停用"), DELETE("2", "删除");
    private final String code;
    private final String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
