package com.cskaoyan.dao;

public interface AccountDao {
    double queryMoneyByName(String name);

    int updateMoneyByName(String name, double money);
}
