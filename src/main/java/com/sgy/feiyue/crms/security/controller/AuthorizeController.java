package com.sgy.feiyue.crms.security.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sgy.feiyue.crms.common.entity.User;
import com.sgy.feiyue.crms.common.util.DataRet;
import com.sgy.feiyue.crms.security.JwtAccessToken;
import com.sgy.feiyue.crms.security.util.CustomJWT;
import com.sgy.feiyue.crms.service.RoleInfoService;
import com.sgy.feiyue.crms.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author SGY
 * @Date 2019/5/12 17:25
 * @Description //登录验证授权
 **/
@Controller
@RequestMapping("/oauth")
public class AuthorizeController {
    @Autowired
    UserInfoService userService;
    @Autowired
    RoleInfoService roleInfoService;

    @ResponseBody
    @RequestMapping(value = "/authorize", method = RequestMethod.POST)
    public DataRet login(String username, String password) {
        boolean flag = userService.checkUser(username);
        if (!flag) {
            return DataRet.error("该用户还未注册", username);
        }
        User user = userService.findByNameAndPwd(username, password);
        String token;
        if (user != null) {
            token = CustomJWT.createToken(user.getId(), user.getUsername());
            if (token == null || token.isEmpty()) {
                return DataRet.error("登录认证失败");
            }
            JwtAccessToken accessToken = new JwtAccessToken("bearer " + token, "bearer");
            return DataRet.success(accessToken);
        } else {
            return DataRet.error("用户名或密码错误");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public DataRet getUserInfo(String token) {
        if (token == null) {
            return DataRet.permissionDeny();
        }
        String userId = CustomJWT.getUserId(CustomJWT.cutToken(token));
        List<String> roleIds = roleInfoService.getRoleIds(userId);
        if (roleIds.isEmpty()) {
            return DataRet.permissionDeny();
        }
        User user = userService.findById(userId);
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user);
        jsonObject.put("roles", roleIds);
        return DataRet.success(jsonObject);
    }


}
