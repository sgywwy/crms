package com.sgy.feiyue.crms;

import com.sgy.feiyue.crms.dao.ClassroomMapper;
import com.sgy.feiyue.crms.common.entity.Classroom;
import com.sgy.feiyue.crms.common.entity.ClassroomExample;
import com.sgy.feiyue.crms.common.util.RoomTypeEnum;
import com.sgy.feiyue.crms.security.util.CustomJWT;
import com.sgy.feiyue.crms.service.RoleInfoService;
import com.sgy.feiyue.crms.service.UserInfoService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.DatatypeConverter;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmsApplicationTests {
    @Autowired
    RoleInfoService roleInfoService;

    public static void main(String[] args) {
        String token = CustomJWT.createToken("111", "aaa");
        Claims claims = CustomJWT.parseToken(token);
        System.out.println(claims);

    }

    @Test
    public void contextLoads() {
        List<String> roleIds = roleInfoService.getRoleIds("2015001");
        System.out.println(roleIds.isEmpty());
    }

}
