package com.tcs.controller;

import com.tcs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {


    @Autowired
    AccountService accountService;

    @RequestMapping("transfer")
    public String transfer(){
        accountService.transferMoney("zhangsan","lisi",100);
        return "转账成功";
    }
}
