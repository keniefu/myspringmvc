package com.cskaoyan.bean;

public class Help {
    //id prefix前缀 province省 city市 operator运营商 areacode区号 postcode邮编
    //areacode | postcode | operator | city | province
    int id;
    String prefix;
    String province;
    String city;
    String operator;
    String areacode;
    String postcode;

    public Help() {
    }

    public Help(int id, String prefix, String province, String city, String operator, String areacode, String postcode) {
        this.id = id;
        this.prefix = prefix;
        this.province = province;
        this.city = city;
        this.operator = operator;
        this.areacode = areacode;
        this.postcode = postcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Help{" +
                "id=" + id +
                ", prefix='" + prefix + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", operator='" + operator + '\'' +
                ", areacode='" + areacode + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
