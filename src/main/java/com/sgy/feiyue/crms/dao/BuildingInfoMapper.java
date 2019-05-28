package com.sgy.feiyue.crms.dao;

import com.sgy.feiyue.crms.common.entity.BuildingInfo;

public interface BuildingInfoMapper {
    int insert(BuildingInfo record);

    int insertSelective(BuildingInfo record);
}