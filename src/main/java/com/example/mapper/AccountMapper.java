package com.example.mapper;

import com.example.model.Account;

import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accountid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer accountid);

    List<Account> selectAllAccount();

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}