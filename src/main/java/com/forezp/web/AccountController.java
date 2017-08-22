package com.forezp.web;

import com.forezp.dao.AccountDao;
import com.forezp.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountDao accountDao;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccountList(){

        return accountDao.findAll();
    }
}
