package com.sgy.feiyue.crms.service.impl;

import com.github.pagehelper.PageHelper;
import com.sgy.feiyue.crms.common.dto.BookingRoomCondition;
import com.sgy.feiyue.crms.common.entity.BookingRoom;
import com.sgy.feiyue.crms.common.entity.BookingRoomExample;
import com.sgy.feiyue.crms.common.util.DateUtil;
import com.sgy.feiyue.crms.dao.BookingRoomMapper;
import com.sgy.feiyue.crms.service.BookingService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/4/26 18:59
 * @Description 用于实现对教室预约申请操作的业务
 **/
public class BookingServiceImpl implements BookingService {
    @Resource
    private BookingRoomMapper bookingRoomMapper;

    /**
     * @Author SGY
     * @Date 2019/4/26 20:37
     * @Param condition
     * @return List
     * @Description 获取不同条件的预约申请数据
     **/
    @Override
    public List<BookingRoom> findBookingRoomList(BookingRoomCondition condition) {
        BookingRoomExample example = new BookingRoomExample();
        BookingRoomExample.Criteria criteria = example.createCriteria();
        // 分页
        if (condition.getPage() > 0 && condition.getPageSize() > 0) {
            PageHelper.startPage(condition.getPage(), condition.getPageSize());
        }
        // 根据审核状态筛选
        if (!condition.getExamines().isEmpty()) {
            criteria.andExamineIn(condition.getExamines());
        }
        // 根据预约时间筛选
        if (condition.getStartDate() != null) {
            if (condition.getEndDate() != null) {
                // 筛选某一天的数据
                criteria.andBookingStartBetween(condition.getStartDate(), DateUtil.addDate(DateUtil.INTERVAL_DAY, condition.getStartDate(), 1));
            } else {
                // 筛选某一时间段的数据（预约起始时间或预约结束时间大于筛选条件的起始时间且小于其结束时间即可）
                criteria.andBookingStartBetween(condition.getStartDate(), condition.getEndDate());
                example.or().andBookingEndBetween(condition.getStartDate(), condition.getEndDate());
            }
        }
        // 排序
        if (!condition.getSort().isEmpty()) {
            example.setOrderByClause(condition.getSort());
        }
        List<BookingRoom> bookingRooms = bookingRoomMapper.selectByExample(example);
        return bookingRooms;
    }

    @Override
    public BookingRoom findById(String id) {
        BookingRoom bookingRoom = bookingRoomMapper.selectByPrimaryKey(id);
        return bookingRoom;
    }

    @Override
    public boolean removeBookingById(String id) {
        int i = bookingRoomMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addBookingRoom(BookingRoom bookingRoom) {
        int i = bookingRoomMapper.insertSelective(bookingRoom);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyBookingRoom(BookingRoom bookingRoom) {
        int i = bookingRoomMapper.updateByPrimaryKeySelective(bookingRoom);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
