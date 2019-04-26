package com.sgy.feiyue.crms.common.util;

public enum  RetCodeEnum {
    SUCESS(1, "执行成功"),
    FAIL(0, "程序错误"),
    NOTHING_CHANGED(2, "无任何改变"),
    BAD_PARAMATER(3, "参数错误"),
    PERMISSION_DENY(4, "无权限访问");

    private int code;

    private String value;

    RetCodeEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
