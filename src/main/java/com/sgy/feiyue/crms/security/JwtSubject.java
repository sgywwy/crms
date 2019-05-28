package com.sgy.feiyue.crms.security;

/**
 * @Author SGY
 * @Date 2019/5/14 20:58
 * @Description //TODO
 **/
public class JwtSubject {
    private String id;
    private String name;
    private String role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public JwtSubject() {
    }

    public JwtSubject(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}
