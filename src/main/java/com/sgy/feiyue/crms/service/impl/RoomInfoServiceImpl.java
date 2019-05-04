package com.sgy.feiyue.crms.service.impl;

import com.github.pagehelper.PageHelper;
import com.sgy.feiyue.crms.common.dto.ClassroomCondition;
import com.sgy.feiyue.crms.common.entity.Classroom;
import com.sgy.feiyue.crms.common.entity.ClassroomExample;
import com.sgy.feiyue.crms.dao.ClassroomMapper;
import com.sgy.feiyue.crms.service.RoomInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/4/26 15:29
 * @Description 用于实现对教室信息操作的业务
 **/
@Service
public class RoomInfoServiceImpl implements RoomInfoService {
    @Resource
    private ClassroomMapper classroomMapper;

    /**
     * @Author SGY
     * @Date 2019/4/26 16:44
     * @Param condition
     * @return List
     * @Description 获取不同条件的教师信息数据
     **/
    @Override
    public List<Classroom> findClassroomList(ClassroomCondition condition) {
        if (condition == null) {
            return new ArrayList<Classroom>();
        }
        // 使用PageHelper分页
        if (condition.getPage() > 0 && condition.getPageSize() > 0) {
            PageHelper.startPage(condition.getPage(), condition.getPageSize());
        }
        // 使用Mybatis的example类生成sql
        ClassroomExample example = new ClassroomExample();
        ClassroomExample.Criteria criteria = example.createCriteria();
        // 根据教室类型筛选
        if (!condition.getRoomTypes().isEmpty()) {
            criteria.andRoomTypeIn(condition.getRoomTypes());
        }
        // 根据教室状态筛选
        if (!condition.getRoomStates().isEmpty()) {
            criteria.andRoomStateIn(condition.getRoomStates());
        }
        // 根据所属大楼筛选
        if (!condition.getRoomBuildings().isEmpty()) {
            criteria.andRoomBuildingIn(condition.getRoomBuildings());
        }
        // 排序
        if (!condition.getSort().isEmpty()) {
            example.setOrderByClause(condition.getSort());
        }

        List<Classroom> classrooms = classroomMapper.selectByExample(example);

        return classrooms;
    }

    @Override
    public Classroom findById(String id) {
        Classroom classroom = classroomMapper.selectByPrimaryKey(id);

        return classroom;
    }

    @Override
    public boolean removeClassroomById(String id) {
        int i = classroomMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addClassroom(Classroom classroom) {
//        if (classroom == null) {
//            return false;
//        }
        int i = classroomMapper.insertSelective(classroom);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addClassroomList(List<Classroom> classrooms) {
        int i = classroomMapper.insertBatch(classrooms);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyClassroom(Classroom classroom) {
        int i = classroomMapper.updateByPrimaryKeySelective(classroom);
        if (i > 0) {
            return true;
        }
        return false;
    }
}