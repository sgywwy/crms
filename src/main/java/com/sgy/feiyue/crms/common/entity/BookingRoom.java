package com.sgy.feiyue.crms.common.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Component
public class BookingRoom implements Serializable {
    private static final long serialVersionUID = 1L;

    private String bookingId;

    private String studentId;//发起预约的学生学号

    private String roomId;//教室id

    private Integer numberOfPeople;//使用人数

    private Date bookingStart;

    private Date bookingEnd;

    private String examine;

    private String reason;//使用说明或者取消预约说明


    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId == null ? null : bookingId.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
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

    public Date getBookingStart() {
        return bookingStart;
    }

    public void setBookingStart(Date bookingStart) {
        this.bookingStart = bookingStart;
    }

    public Date getBookingEnd() {
        return bookingEnd;
    }

    public void setBookingEnd(Date bookingEnd) {
        this.bookingEnd = bookingEnd;
    }

    public String getExamine() {
        return examine;
    }

    public void setExamine(String examine) {
        this.examine = examine == null ? null : examine.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingRoom that = (BookingRoom) o;
        return bookingId.equals(that.bookingId) &&
                studentId.equals(that.studentId) &&
                roomId.equals(that.roomId) &&
                numberOfPeople.equals(that.numberOfPeople) &&
                bookingStart.equals(that.bookingStart) &&
                bookingEnd.equals(that.bookingEnd) &&
                examine.equals(that.examine) &&
                reason.equals(that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, studentId, roomId, numberOfPeople, bookingStart, bookingEnd, examine, reason);
    }

    @Override
    public String toString() {
        return "BookingRoom{" +
                "bookingId='" + bookingId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", roomId='" + roomId + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", bookingStart=" + bookingStart +
                ", bookingEnd=" + bookingEnd +
                ", examine='" + examine + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}