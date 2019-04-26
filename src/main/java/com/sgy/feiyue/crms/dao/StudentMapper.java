package com.sgy.feiyue.crms.dao;

import com.sgy.feiyue.crms.common.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Student selectByIdAndPassword(String uname, String pwd);

    List<Student> selectStudentList();

    int insertBatch(@Param("students") List<Student> students);
}