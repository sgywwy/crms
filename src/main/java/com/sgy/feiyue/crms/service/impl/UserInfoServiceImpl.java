package com.sgy.feiyue.crms.service.impl;

import com.sgy.feiyue.crms.common.dto.UserRoleInfo;
import com.sgy.feiyue.crms.common.entity.User;
import com.sgy.feiyue.crms.dao.UserMapper;
import com.sgy.feiyue.crms.dao.UserRoleMapper;
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
    private UserMapper userMapper;
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<User> findUserList() {
//        List<User> students = userMapper.selectUserList();
        return null;
    }

    @Override
    public User findById(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public boolean removeUserById(String id) {
        int i = userMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(User student) {
        int i = userMapper.insertSelective(student);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addUserList(List<User> students) {
//        int i = userMapper.insertBatch(students);
//        if (i > 0) {
//            return true;
//        }
        return false;
    }

    @Override
    public boolean modifyUser(User student) {
        int i = userMapper.updateByPrimaryKeySelective(student);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @Override
    public User findByNameAndPwd(String name, String pwd) {
        User user = userMapper.selectUser(name, pwd);
        return user;
    }

    @Override
    public boolean checkUser(String name) {
        int i = userMapper.countByUsername(name);
        if (i == 1) {
            return true;
        }
        return false;
    }
}
