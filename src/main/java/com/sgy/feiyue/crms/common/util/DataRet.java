package com.sgy.feiyue.crms.common.util;

/**
 * @Author SGY
 * @Date 2019/4/26 12:14
 * @Description 用于control层返回值对象
 **/
public class DataRet {
    private int code;//"1"成功,"2"错误

    private String message;

    private Object data;

    public DataRet(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public DataRet(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public DataRet(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static DataRet success(Object data) {
        DataRet dataRet = new DataRet(RetCodeEnum.SUCESS.getCode(), RetCodeEnum.SUCESS.getValue(), data);
        return dataRet;
    }

    public static DataRet success(String msg, Object data) {
        DataRet dataRet = new DataRet(RetCodeEnum.SUCESS.getCode(), msg, data);
        return dataRet;
    }

    public static DataRet success(String msg) {
        DataRet dataRet = new DataRet(RetCodeEnum.SUCESS.getCode(), msg);
        return dataRet;
    }

    public static DataRet error() {
        DataRet dataRet = new DataRet(RetCodeEnum.FAIL.getCode(), RetCodeEnum.FAIL.getValue());
        return dataRet;
    }

    public static DataRet error(String msg, Object data) {
        DataRet dataRet = new DataRet(RetCodeEnum.FAIL.getCode(), msg, data);
        return dataRet;
    }

    public static DataRet error(String msg) {
        DataRet dataRet = new DataRet(RetCodeEnum.FAIL.getCode(), msg);
        return dataRet;
    }

    public static DataRet nothingChanged(){
        DataRet dataRet = new DataRet(RetCodeEnum.NOTHING_CHANGED.getCode(),RetCodeEnum.NOTHING_CHANGED.getValue());
        return dataRet;
    }

    public static DataRet permissionDeny(){
        DataRet dataRet = new DataRet(RetCodeEnum.PERMISSION_DENY.getCode(),RetCodeEnum.PERMISSION_DENY.getValue());
        return dataRet;
    }

    public static DataRet wrongParameter(){
        DataRet dataRet = new DataRet(RetCodeEnum.BAD_PARAMATER.getCode(),RetCodeEnum.BAD_PARAMATER.getValue());
        return dataRet;
    }

    private DataRet() {
    }
}
