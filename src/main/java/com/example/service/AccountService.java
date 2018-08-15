package com.example.service;

import com.example.model.Account;

import java.util.List;

public interface AccountService {

    int addAccount(Account account);

    List<Account> findAllAccount(int pageNum, int pageSize);
}
