package com.sgy.feiyue.crms.service;

import com.sgy.feiyue.crms.common.dto.ClassroomCondition;
import com.sgy.feiyue.crms.common.entity.Classroom;

import java.util.List;

public interface RoomInfoService {
    List<Classroom> findClassroomList(ClassroomCondition condition);

    Classroom findById(String id);

    boolean removeClassroomById(String id);

    boolean addClassroom(Classroom classroom);

    boolean addClassroomList(List<Classroom> classrooms);

    boolean modifyClassroom(Classroom classroom);
}
