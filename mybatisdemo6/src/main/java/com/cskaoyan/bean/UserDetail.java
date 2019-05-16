package com.cskaoyan.bean;

import java.io.Serializable;

/**
 * @author Keniefu
 * @date 2019/5/14
 */
public class UserDetail implements Serializable {
    private static final long serialVersionUID = -4640841063415773286L;
    private int id;
    private String address;
    private String phone;

    public UserDetail() {
    }

    public UserDetail(int id, String address, String phone) {
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
