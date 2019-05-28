package com.sgy.feiyue.crms.common.dto;

import java.util.Objects;

/**
 * @Author SGY
 * @Date 2019/5/14 12:26
 * @Description //用户信息DTO
 **/
public class UserRoleInfo {
    private String id;

    private String username;

    private String password;

    private String realname;

    private String major;

    private String classes;

    private String[] roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
