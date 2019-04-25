package com.sgy.feiyue.crms.common.dao;

import com.sgy.feiyue.crms.common.entity.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);

    Manager selectByIdAndPassword(String uname, String pwd);
}