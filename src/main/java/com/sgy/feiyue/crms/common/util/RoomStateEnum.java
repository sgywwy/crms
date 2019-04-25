package com.sgy.feiyue.crms.common.util;

public enum RoomStateEnum {
    Empty("0", "空闲"),
    Occupy("1", "占用"),
    Booking("2", "预约");


    private String code;
    private String value;

    RoomStateEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }
}
