package com.sgy.feiyue.crms.common.dao;

import com.sgy.feiyue.crms.common.entity.Classroom;
import com.sgy.feiyue.crms.common.entity.ClassroomExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassroomMapper {
    int countByExample(ClassroomExample example);

    int deleteByPrimaryKey(String roomId);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    List<Classroom> selectByExample(ClassroomExample example);

    Classroom selectByPrimaryKey(String roomId);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);
}