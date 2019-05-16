package com.cskaoyan.storeDemo.bean;

import java.util.Date;

public class User {
    private int uid;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private Date birthday;
    private Date updatetime;
    private String checkid;
    private String isActive;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", updatetime=" + updatetime +
                ", checkid='" + checkid + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public User(int uid, String username, String nickname, String password, String email, Date birthday, Date updatetime, String checkid, String isActive) {
        this.uid = uid;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.updatetime = updatetime;
        this.checkid = checkid;
        this.isActive = isActive;
    }

    public User() {
    }

    public String getCheckid() {
        return checkid;
    }

    public void setCheckid(String checkid) {
        this.checkid = checkid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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


}
