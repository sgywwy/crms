package com.sgy.feiyue.crms.common.util;

public enum RoomTypeEnum {
    Common("0", "普通教室"),
    MultiMedia("1", "多媒体"),
    Computer("2", "机房"),
    Lecture("3", "阶梯教室"),
    Laboratory("4", "实验室"),
    Meeting("5", "会议室");


    private String code;
    private String value;

    RoomTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }
}
