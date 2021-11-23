package com.example.policycreation.security;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Component
public class User {

    @Id
    private int userid;
    private String userpassword;
    private String username;

    public User(int userid, String userpassword, String username) {
        this.userid = userid;
        this.userpassword = userpassword;
        this.username = username;
    }

    public User(String userpassword, String username) {
        this.userpassword = userpassword;
        this.username = username;
    }

    public User() {
        super();
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userpassword='" + userpassword + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
