package com.tcs.service;

import com.tcs.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;
    @Transactional//增加事务
    @Override
    public void transferMoney(String out, String in, int money) {
        accountMapper.transferMoney(out,money);//转出
        /*int i= 1/0;*/
        money = -money;
        accountMapper.transferMoney(in,money);//转入
    }
}
