package com.sgy.feiyue.crms.dao;

import com.sgy.feiyue.crms.common.dto.UserRoleInfo;
import com.sgy.feiyue.crms.common.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<String> selectByUserId(@Param("id") String id);
}