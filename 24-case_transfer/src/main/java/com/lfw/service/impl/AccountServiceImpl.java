package com.lfw.service.impl;

import com.lfw.dao.AccountDao;
import com.lfw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i = 1 / 0;   //由于这里报错，后面的程序不执行。钱会一直减少，所以要用到事务，需要加上@Transactional注解
        accountDao.inMoney(in, money);
    }
}
