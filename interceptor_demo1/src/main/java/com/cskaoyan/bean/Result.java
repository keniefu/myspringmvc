package com.cskaoyan.bean;

public class Result {
    //    success		{0/1}	执行结果
//    phone		string	查询的手机号码
//    msg		string	出错消息,当出错时将会出现此节点，否则不出现
//    area		string	手机号码所在地区区号
//    postno		string	所在地区邮编
//    prefix		string	运营商号段
//    operators	string	所属运营商
//    city		string	归属地(城市)
//    province	string	归属地（省）
    int success;
    String phone;
    String msg;
    String area;
    String postno;
    String prefix;
    String operators;
    String city;
    String province;

    public Result() {
    }

    public Result(int success, String phone, String msg, String area, String postno, String prefix, String operators, String city, String province) {
        this.success = success;
        this.phone = phone;
        this.msg = msg;
        this.area = area;
        this.postno = postno;
        this.prefix = prefix;
        this.operators = operators;
        this.city = city;
        this.province = province;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPostno() {
        return postno;
    }

    public void setPostno(String postno) {
        this.postno = postno;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getOperators() {
        return operators;
    }

    public void setOperators(String operators) {
        this.operators = operators;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", phone='" + phone + '\'' +
                ", msg='" + msg + '\'' +
                ", area='" + area + '\'' +
                ", postno='" + postno + '\'' +
                ", prefix='" + prefix + '\'' +
                ", operators='" + operators + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
