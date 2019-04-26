package com.sgy.feiyue.crms.dao;

import com.sgy.feiyue.crms.common.entity.BookingRoom;
import com.sgy.feiyue.crms.common.entity.BookingRoomExample;

import java.util.List;

public interface BookingRoomMapper {
    int countByExample(BookingRoomExample example);

    int deleteByPrimaryKey(String bookingId);

    int insert(BookingRoom record);

    int insertSelective(BookingRoom record);

    List<BookingRoom> selectByExample(BookingRoomExample example);

    BookingRoom selectByPrimaryKey(String bookingId);

    int updateByPrimaryKeySelective(BookingRoom record);

    int updateByPrimaryKey(BookingRoom record);
}