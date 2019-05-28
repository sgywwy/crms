package com.sgy.feiyue.crms.service;

import com.sgy.feiyue.crms.common.dto.UserRoleInfo;
import com.sgy.feiyue.crms.common.entity.User;

import java.util.List;

public interface UserInfoService {
    List<User> findUserList();

    User findById(String id);

    boolean removeUserById(String id);

    boolean addUser(User user);

    boolean addUserList(List<User> users);

    boolean modifyUser(User user);

    User findByNameAndPwd(String name, String pwd);

    boolean checkUser(String name);


}
