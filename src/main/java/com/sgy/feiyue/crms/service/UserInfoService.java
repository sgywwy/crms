package com.sgy.feiyue.crms.service;

import com.sgy.feiyue.crms.common.entity.Student;

import java.util.List;

public interface UserInfoService {
    List<Student> findStudentList();

    Student findById(String id);

    boolean removeStudentById(String id);

    boolean addStudent(Student student);

    boolean addStudentList(List<Student> students);

    boolean modifyStudent(Student student);
}
