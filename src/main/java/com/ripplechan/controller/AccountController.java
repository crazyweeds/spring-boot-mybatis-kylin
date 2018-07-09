package com.ripplechan.controller;

import com.ripplechan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author RippleChan
 * @date 2018-07-05
 * @time 14:49
 */
@RequestMapping(value = "/account")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public Object query() {
        List<Map<String, Object>> query = accountService.myQuery();
        return query;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Object queryAll() {
        return accountService.queryAll();
    }

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public Object page() {
        return accountService.page();
    }


}
