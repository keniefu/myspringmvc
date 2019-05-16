package com.cskaoyan.bean;

public class ProductSearchCriteria {
    private String id;
    private int cid;
    private String name;
    private double minestoreprice;
    private double maxestoreprice;

    public ProductSearchCriteria() {
    }

    public ProductSearchCriteria(String id, int cid, String name, double minestoreprice, double maxestoreprice) {
        this.id = id;
        this.cid = cid;
        this.name = name;
        this.minestoreprice = minestoreprice;
        this.maxestoreprice = maxestoreprice;
    }

    @Override
    public String toString() {
        return "ProductSearchCriteria{" +
                "id='" + id + '\'' +
                ", cid=" + cid +
                ", name='" + name + '\'' +
                ", minestoreprice=" + minestoreprice +
                ", maxestoreprice=" + maxestoreprice +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinestoreprice() {
        return minestoreprice;
    }

    public void setMinestoreprice(double minestoreprice) {
        this.minestoreprice = minestoreprice;
    }

    public double getMaxestoreprice() {
        return maxestoreprice;
    }

    public void setMaxestoreprice(double maxestoreprice) {
        this.maxestoreprice = maxestoreprice;
    }
}
