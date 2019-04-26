package com.sgy.feiyue.crms.common.dto;

import java.util.List;

/**
 * @Author SGY
 * @Date 2019/4/25 20:22
 * @Description 教室信息DTO
 **/
public class ClassroomCondition {
    private String roomId;

    private String roomNumber;//门牌号

    private String roomName;

    private List<String> roomStates;

    private List<String> roomTypes;

    private List<String> roomBuildings;

    private Integer roomCapacity;

    private String sort;//排序

    private int page;

    private int pageSize;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<String> getRoomStates() {
        return roomStates;
    }

    public void setRoomStates(List<String> roomStates) {
        this.roomStates = roomStates;
    }

    public List<String> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(List<String> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public List<String> getRoomBuildings() {
        return roomBuildings;
    }

    public void setRoomBuildings(List<String> roomBuildings) {
        this.roomBuildings = roomBuildings;
    }

    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
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

    @Override
    public String toString() {
        return "ClassroomCondition{" +
                "roomId='" + roomId + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomStates=" + roomStates +
                ", roomTypes=" + roomTypes +
                ", roomBuildings=" + roomBuildings +
                ", roomCapacity=" + roomCapacity +
                ", sort='" + sort + '\'' +
                ", page=" + page +
                ", pageSize=" + pageSize +
                '}';
    }
}
