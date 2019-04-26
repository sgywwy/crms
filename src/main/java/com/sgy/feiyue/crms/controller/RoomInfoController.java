package com.sgy.feiyue.crms.controller;

import com.sgy.feiyue.crms.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Author SGY
 * @Date 2019/4/26 12:00
 * @Description 处理对教室信息操作的请求
 **/
@Controller
@RequestMapping(value = "/room")
public class RoomInfoController {
    @Resource
    private RoomInfoService roomInfoService;

}
