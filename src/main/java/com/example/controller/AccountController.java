package com.example.controller;

import com.example.mapper.AccountMapper;
import com.example.model.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addAccount(Account account){
        return accountService.addAccount(account);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllAccount(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return accountService.findAllAccount(pageNum,pageSize);
    }
}
