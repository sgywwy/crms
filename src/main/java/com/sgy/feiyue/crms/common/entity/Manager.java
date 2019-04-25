package com.sgy.feiyue.crms.common.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

@Component
public class Manager implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String password;

    private String realname;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return id.equals(manager.id) &&
                username.equals(manager.username) &&
                password.equals(manager.password) &&
                realname.equals(manager.realname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, realname);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}