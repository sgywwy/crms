package com.sgy.feiyue.crms.service.impl;

import com.sgy.feiyue.crms.common.entity.Role;
import com.sgy.feiyue.crms.common.entity.UserRole;
import com.sgy.feiyue.crms.dao.RoleMapper;
import com.sgy.feiyue.crms.dao.UserRoleMapper;
import com.sgy.feiyue.crms.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/5/24 17:59
 * @Description //TODO
 **/
@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public List<String> getRoleIds(String userId) {
        List<String> role = userRoleMapper.selectByUserId(userId);
        return new ArrayList<String>(role);
    }
}
