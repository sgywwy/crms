package com.sgy.feiyue.crms.common.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

@Component
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String password;

    private String grade;

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
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
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id.equals(student.id) &&
                username.equals(student.username) &&
                password.equals(student.password) &&
                grade.equals(student.grade) &&
                realname.equals(student.realname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, grade, realname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", grade='" + grade + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}