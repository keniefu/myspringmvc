package com.cskaoyan.dao.impl;

import com.cskaoyan.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Autowired
    public void mySetDataSource(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
    @Override
    public double queryMoneyByName(String name) {
        String sql = "select money from j13_account_t where name = ?";
        String s = this.getJdbcTemplate().queryForObject(sql, String.class, name);
        return Double.parseDouble(s);
    }

    @Override
    public int updateMoneyByName(String name, double money) {
        String sql = "update j13_account_t set money = ? where name = ?";
        int update = this.getJdbcTemplate().update(sql, money, name);
        return update;
    }
}
