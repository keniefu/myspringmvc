package com.cskaoyan.bean;

import java.io.Serializable;

/**
 * @author Keniefu
 * @date 2019/5/14
 */
public class User implements Serializable {
    private static final long serialVersionUID = -1056894531292223991L;
    private int id;
    private String username;
    private String password;
    private String email;
    private UserDetail userDetail;

    public User() {
    }

    public User(int id, String username, String password, String email, UserDetail userDetail) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userDetail = userDetail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userDetail=" + userDetail +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
