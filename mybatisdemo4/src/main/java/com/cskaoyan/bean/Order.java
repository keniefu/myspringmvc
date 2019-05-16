package com.cskaoyan.bean;

import java.util.Date;

/**
 * Order class
 * @author Keniefu
 * @date 2019/5/11
 */
public class Order {
    private String oid;
    private double money;
    private int state;
    private Date ordertime;
    private int uid;

    public Order() {
    }

    public Order(String oid, double money, int state, Date ordertime, int uid) {
        this.oid = oid;
        this.money = money;
        this.state = state;
        this.ordertime = ordertime;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", money=" + money +
                ", state=" + state +
                ", ordertime='" + ordertime + '\'' +
                ", uid=" + uid +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
