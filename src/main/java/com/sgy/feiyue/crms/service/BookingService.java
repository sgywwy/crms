package com.sgy.feiyue.crms.service;

import com.sgy.feiyue.crms.common.dto.BookingRoomCondition;
import com.sgy.feiyue.crms.common.entity.BookingRoom;

import java.util.List;

public interface BookingService {
    List<BookingRoom> findBookingRoomList(BookingRoomCondition condition);

    BookingRoom findById(String id);

    boolean removeBookingById(String id);

    boolean addBookingRoom(BookingRoom bookingRoom);

    boolean modifyBookingRoom(BookingRoom bookingRoom);
}



