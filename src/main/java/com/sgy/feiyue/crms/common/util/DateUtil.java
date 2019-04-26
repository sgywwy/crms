package com.sgy.feiyue.crms.common.util;

import java.util.Date;

/**
 * @Author SGY
 * @Date 2019/4/26 20:08
 * @Description 日期时间工具类
 **/
public class DateUtil {
    /**
     * 日
     */
    public final static int INTERVAL_DAY = 1;

    /**
     * 周
     */
    public final static int INTERVAL_WEEK = 2;

    /**
     * 月
     */
    public final static int INTERVAL_MONTH = 3;

    /**
     * 年
     */
    public final static int INTERVAL_YEAR = 4;

    /**
     * 小时
     */
    public final static int INTERVAL_HOUR = 5;

    /**
     * 分钟
     */
    public final static int INTERVAL_MINUTE = 6;

    /**
     * 秒
     */
    public final static int INTERVAL_SECOND = 7;

    private DateUtil() {
    }
    /**
     * @Author SGY
     * @Date 2019/4/26 20:23
     * @Param interval,date,n
     * @return Date
     * @Description 对给定的时间进行增减操作(n可为负数)
     **/
    public static Date addDate(int interval, Date date, int n) {
        long time = date.getTime(); // 单位毫秒
        n *= 1000;// 乘1000匹配单位
        switch (interval) {
            case INTERVAL_DAY:
                time = time + n * 86400;// 60 * 60 * 24s;
                break;
            case INTERVAL_WEEK:
                time = time + n * 604800;// 60 * 60 * 24 * 7s;
                break;
            case INTERVAL_MONTH:
                time = time + n * 2678400;// 60 * 60 * 24 * 31s;
                break;
            case INTERVAL_YEAR:
                time = time + n * 31536000;// 60 * 60 * 24 * 365s;
                break;
            case INTERVAL_HOUR:
                time = time + n * 3600;// 60 * 60s ;
                break;
            case INTERVAL_MINUTE:
                time = time + n * 60;
                break;
            case INTERVAL_SECOND:
                time = time + n;
                break;
            default:
        }

        Date result = new Date();
        result.setTime(time);
        return result;
    }
}
