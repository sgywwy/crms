package com.sgy.feiyue.crms.controller;

import com.sgy.feiyue.crms.common.dto.ClassroomCondition;
import com.sgy.feiyue.crms.common.entity.Classroom;
import com.sgy.feiyue.crms.common.util.DataRet;
import com.sgy.feiyue.crms.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/4/26 12:00
 * @Description 处理对教室信息操作的请求
 **/
@Controller
@RequestMapping(value = "builds")
public class RoomInfoController {
    @Resource
    private RoomInfoService roomInfoService;

    /**
     * @Author SGY
     * @Date 2019/4/27 21:53
     * @Param condition
     * @return DataRet
     * @Description 教室信息的多条件查询
     **/
    @ResponseBody
    @RequestMapping(value = "/{id}/rooms", method = RequestMethod.POST)
    public DataRet getRoomList(@RequestBody ClassroomCondition condition) {
        List<Classroom> classroomList = roomInfoService.findClassroomList(condition);
        DataRet data;
        if (classroomList.isEmpty()) {
            data = DataRet.notMatchResult();
            return data;
        }
        data = DataRet.success(classroomList);
        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}/rooms/{id}", method = RequestMethod.GET)
    public DataRet getRoom(@PathVariable String id) {
        Classroom classroom = roomInfoService.findById(id);
        DataRet data;
        if (classroom == null || classroom.getRoomId() == null) {
            data = DataRet.notMatchResult();
            return data;
        }
        data = DataRet.success(classroom);
        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public DataRet deleteRoom(@PathVariable String id) {
        boolean flag = roomInfoService.removeClassroomById(id);
        DataRet data;
        if (flag) {
            data = DataRet.success("删除成功");
            return data;
        }
        data = DataRet.error();
        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.PATCH)
    public DataRet postRoom(@RequestBody Classroom classroom) {
        boolean flag = roomInfoService.addClassroom(classroom);
        DataRet data;
        if (flag) {
            data = DataRet.success("添加成功");
            return data;
        }
        data = DataRet.error();
        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public DataRet postRoomList(@RequestBody List<Classroom> classrooms) {
        boolean flag = roomInfoService.addClassroomList(classrooms);
        DataRet data;
        if (flag) {
            data = DataRet.success("批量添加成功");
            return data;
        }
        data = DataRet.error();
        return data;
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public DataRet putRoom(@RequestBody Classroom classroom) {
        boolean flag = roomInfoService.modifyClassroom(classroom);
        DataRet data;
        if (flag) {
            data = DataRet.success("更新成功");
            return data;
        }
        data = DataRet.error();
        return data;
    }
}
