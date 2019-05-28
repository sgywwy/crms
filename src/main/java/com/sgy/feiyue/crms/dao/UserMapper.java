package com.sgy.feiyue.crms.dao;

import com.sgy.feiyue.crms.common.dto.UserRoleInfo;
import com.sgy.feiyue.crms.common.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int countByUsername(@Param("name") String name);

    User selectUser(@Param("name") String name, @Param("pwd") String pwd);
}