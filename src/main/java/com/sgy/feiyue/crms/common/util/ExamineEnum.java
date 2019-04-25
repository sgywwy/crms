package com.sgy.feiyue.crms.common.util;

public enum ExamineEnum {
    UnderReview("0", "审核中"),//审核中
    Argree("1", "同意"),//同意
    Reject("2", "驳回"),//驳回
    Canel("x", "取消");//取消申请

    private String value;
    private String code;

    ExamineEnum(String code, String value) {
        this.value = value;
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
