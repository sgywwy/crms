package com.sgy.feiyue.crms.common.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

@Component
public class Classroom implements Serializable {
    private static final long serialVersionUID = 1L;

    private String roomId;

    private String roomNumber;//门牌号

    private String roomName;

    private String roomState;

    private String roomType;

    private Integer roomCapacity;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState == null ? null : roomState.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return roomCapacity.equals(classroom.roomCapacity) &&
                roomId.equals(classroom.roomId) &&
                roomNumber.equals(classroom.roomNumber) &&
                roomName.equals(classroom.roomName) &&
                roomState.equals(classroom.roomState) &&
                roomType.equals(classroom.roomType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, roomNumber, roomName, roomState, roomType, roomCapacity);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "roomId='" + roomId + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomState='" + roomState + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomCapacity=" + roomCapacity +
                '}';
    }
}