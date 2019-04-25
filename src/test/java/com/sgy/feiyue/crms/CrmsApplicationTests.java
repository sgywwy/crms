package com.sgy.feiyue.crms;

import com.sgy.feiyue.crms.common.dao.ClassroomMapper;
import com.sgy.feiyue.crms.common.entity.Classroom;
import com.sgy.feiyue.crms.common.entity.ClassroomExample;
import com.sgy.feiyue.crms.common.util.RoomStateEnum;
import com.sgy.feiyue.crms.common.util.RoomTypeEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmsApplicationTests {
    @Autowired
    ClassroomMapper classroomMapper;

    @Test
    public void contextLoads() {
        ClassroomExample example = new ClassroomExample();

        ClassroomExample.Criteria criteria1 = example.createCriteria();
        criteria1.andRoomStateIsNotNull().andRoomTypeEqualTo(RoomTypeEnum.Common.getCode());

        example.setOrderByClause("room_state desc");
        List<Classroom> i = classroomMapper.selectByExample(example);
    }

}
