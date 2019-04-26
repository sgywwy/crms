package com.sgy.feiyue.crms;

import com.sgy.feiyue.crms.dao.ClassroomMapper;
import com.sgy.feiyue.crms.common.entity.Classroom;
import com.sgy.feiyue.crms.common.entity.ClassroomExample;
import com.sgy.feiyue.crms.common.util.RoomTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmsApplicationTests {
    @Autowired
    ClassroomMapper classroomMapper;

    @Test
    public void contextLoads() {
        Classroom classroom = new Classroom();
        classroom.setRoomBuilding("1");
        classroom.setRoomCapacity(1);
        classroom.setRoomId("6");
        classroom.setRoomName("4");
        classroom.setRoomNumber("2");
        classroom.setRoomState("0");
        classroom.setRoomType("1");
        Classroom c = new Classroom();
        c.setRoomBuilding("1");
        c.setRoomCapacity(1);
        c.setRoomId("7");
        c.setRoomName("4");
        c.setRoomNumber("2");
        c.setRoomState("0");
        c.setRoomType("1");
        List<Classroom> classrooms = new ArrayList<Classroom>();
        classrooms.add(c);
        classrooms.add(classroom);

        int i = classroomMapper.insertBatch(classrooms);

        System.out.println(i);

    }

}
