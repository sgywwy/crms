package com.sgy.feiyue.crms.common.dto;

import java.util.Date;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/4/26 10:22
 * @Description 教室预约DTO
 **/
public class BookingRoomCondition {
    private String bookingId;

    private String studentId;//发起预约的学生学号

    private String roomId;//教室id

    private Integer numberOfPeople;//使用人数

    private Date startDate;

    private Date endDate;

    private List<String> examines;

    private String sort;

    private int page;

    private int pageSize;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<String> getExamines() {
        return examines;
    }

    public void setExamines(List<String> examines) {
        this.examines = examines;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
