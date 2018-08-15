package com.example.springbootmybatisdemo;

import com.example.mapper.AccountMapper;
import com.example.model.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @ResponseBody
    @RequestMapping(value = "/add", method=RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public int addAccount(@RequestParam Integer accountId, @RequestParam String accountName){
        Account account = new Account();
        account.setAccountid(accountId);
        account.setAccountname(accountName);
        return accountMapper.insertSelective(account);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllAccount(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return accountService.findAllAccount(pageNum,pageSize);
    }
}
