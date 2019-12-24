package com.tcs.service;

public interface AccountService {
    //转账
    void transferMoney(String out,String in,int money);
}
