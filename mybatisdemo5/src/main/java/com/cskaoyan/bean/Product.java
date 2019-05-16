package com.cskaoyan.bean;

public class Product {

    private String id;
    private String name;
    private double estoreprice;
    private double markprice;
    private int num;
    private int cid;
    private String imgurl;
    private String desc;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", estoreprice=" + estoreprice +
                ", markprice=" + markprice +
                ", num=" + num +
                ", cid=" + cid +
                ", imgurl='" + imgurl + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Product() {
    }

    public Product(String pid, String pname, double estoreprice, double markprice, int pnum, int cid, String imgurl, String desc) {
        this.id = pid;
        this.name = pname;
        this.estoreprice = estoreprice;
        this.markprice = markprice;
        this.num = pnum;
        this.cid = cid;
        this.imgurl = imgurl;
        this.desc = desc;
    }

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

    public double getEstoreprice() {
        return estoreprice;
    }

    public void setEstoreprice(double estoreprice) {
        this.estoreprice = estoreprice;
    }

    public double getMarkprice() {
        return markprice;
    }

    public void setMarkprice(double markprice) {
        this.markprice = markprice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
