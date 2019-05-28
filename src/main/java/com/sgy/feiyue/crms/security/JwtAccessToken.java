package com.sgy.feiyue.crms.security;

import com.sgy.feiyue.crms.common.entity.User;

/**
 * @Author SGY
 * @Date 2019/5/14 19:21
 * @Description //存放token
 **/
public class JwtAccessToken {
    private String access_token;
    private String token_type;
    private static final long expires_in = 60 * 60 * 24 * 1000;// ONE DAY

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public static long getExpires_in() {
        return expires_in;
    }

    public JwtAccessToken(String access_token, String token_type) {
        this.access_token = access_token;
        this.token_type = token_type;
    }
}
