package com.sgy.feiyue.crms.service.impl;

import com.sgy.feiyue.crms.common.entity.Student;
import com.sgy.feiyue.crms.dao.StudentMapper;
import com.sgy.feiyue.crms.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/4/26 15:13
 * @Description 用于实现对用户信息操作的业务
 **/
@Service()
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudentList() {
        List<Student> students = studentMapper.selectStudentList();
        return students;
    }

    @Override
    public Student findById(String id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public boolean removeStudentById(String id) {
        int i = studentMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        int i = studentMapper.insertSelective(student);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addStudentList(List<Student> students) {
        int i = studentMapper.insertBatch(students);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyStudent(Student student) {
        int i = studentMapper.updateByPrimaryKeySelective(student);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
