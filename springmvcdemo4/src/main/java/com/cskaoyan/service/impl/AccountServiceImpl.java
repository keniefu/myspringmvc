package com.cskaoyan.service.impl;

import com.cskaoyan.dao.AccountDao;
import com.cskaoyan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("myaccountservice")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public boolean transferMoney(String from, String to, double money) {
        double fromMoney = accountDao.queryMoneyByName(from) - money;
        int r1 = accountDao.updateMoneyByName(from, fromMoney);
//        int i = 1 / 0;
        double toMoney = accountDao.queryMoneyByName(to) + money;
        int r2 = accountDao.updateMoneyByName(to, toMoney);
        return r1 + r2 == 2;
    }
}
