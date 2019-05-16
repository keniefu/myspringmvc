package com.cskaoyan.bean;

import java.util.List;

public class PageHelper {
//    mysql> create table j13_pagehelper_t(
//    -> total_records_num bigint,
//    -> id int primary key auto_increment,
//    -> current_page int,
//            -> total_page int);
    private int id;
    private long totalRecordsNum;
    private int currentPageNum;
    private int totalPageNum;
    private double hignPrice;
    private double lowPrice;
    private List<Product> records;

    @Override
    public String toString() {
        return "PageHelper{" +
                "id=" + id +
                ", totalRecordsNum=" + totalRecordsNum +
                ", currentPageNum=" + currentPageNum +
                ", totalPageNum=" + totalPageNum +
                ", hignPrice=" + hignPrice +
                ", lowPrice=" + lowPrice +
                ", records=" + records +
                '}';
    }

    public double getHignPrice() {
        return hignPrice;
    }

    public void setHignPrice(double hignPrice) {
        this.hignPrice = hignPrice;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }


    public PageHelper() {
    }

    public PageHelper(int id, long totalRecordsNum, int currentPageNum, int totalPageNum, double hignPrice, double lowPrice, List<Product> records) {
        this.id = id;
        this.totalRecordsNum = totalRecordsNum;
        this.currentPageNum = currentPageNum;
        this.totalPageNum = totalPageNum;
        this.hignPrice = hignPrice;
        this.lowPrice = lowPrice;
        this.records = records;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTotalRecordsNum() {
        return totalRecordsNum;
    }

    public void setTotalRecordsNum(long totalRecordsNum) {
        this.totalRecordsNum = totalRecordsNum;
    }

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public void setCurrentPageNum(int currentPageNum) {
        this.currentPageNum = currentPageNum;
    }

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public List<Product> getRecords() {
        return records;
    }

    public void setRecords(List<Product> records) {
        this.records = records;
    }
}
