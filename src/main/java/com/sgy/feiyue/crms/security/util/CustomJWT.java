package com.sgy.feiyue.crms.security.util;

import com.sgy.feiyue.crms.common.util.DateUtil;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

/**
 * @Author SGY
 * @Date 2019/5/10 20:00
 * @Description //token生成
 **/
public class CustomJWT {
    private static Logger log = LoggerFactory.getLogger(CustomJWT.class);

    private final static String stringKey = "sgy_qwerdftazxcmnvbhujniokmlp.uyfxgjhnejkghtuig";//本地配置文件中加密的密文

    private CustomJWT() {

    }

    /**
     * 由字符串生成加密key
     * @return
     */
    private static Key generateKey(){
        byte[] encodedKey = DatatypeConverter.parseBase64Binary(stringKey);
        Key key = new SecretKeySpec(encodedKey, 0, encodedKey.length, SignatureAlgorithm.HS256.getJcaName());
        return key;
    }

    public static String createToken(String userId, String userName) {
        try{
            Date isDate = new Date(System.currentTimeMillis());
            String jwts = Jwts.builder()
                    .setId(userId)// 设置jwt唯一身份标识，作为一次性token，避免重复攻击
                    .setIssuer("crms.feiyue.sgy.com")// 签发者
                    .setSubject(userName)// 用户
                    .setAudience("app")// 接收者
                    .setExpiration(DateUtil.addDate(DateUtil.INTERVAL_DAY, isDate, 1))// 过期时间 = 签发时间 + 1 （天）
                    .setIssuedAt(isDate)// 签发时间
                    .signWith(generateKey(), SignatureAlgorithm.HS256)// 签名信息
                    .compact();

            return jwts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static Claims parseToken(String token) {
        Claims jws = null;
        try{
            jws = Jwts.parser()  // 得到DefaultJwtParser
                    .setSigningKey(generateKey())// 设置签名的秘钥
                    .parseClaimsJws(token).getBody();// 设置需要解析的jwt
            log.info("可信任的token");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("危险的token--" + token);
        }
        return jws;
    }

    public static String getUserId(String token) {
        Claims jws = parseToken(token);
        String userId = jws.getId();
        return userId;
    }

    public static String cutToken(String authToken) {
        String token = null;
        if (authToken == null || authToken.isEmpty() || authToken.length() < 7) {
            return token;
        }
        //解析token
        String head = authToken.substring(0, 6);
        if (!"bearer".equalsIgnoreCase(head)) {
            return token;
        }
        token = authToken.substring(7);
        return token;
    }
}
