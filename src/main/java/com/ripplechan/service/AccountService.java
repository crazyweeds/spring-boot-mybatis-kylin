package com.ripplechan.service;

import com.ripplechan.entity.Account;

import java.util.List;
import java.util.Map;

/**
 * @author RippleChan
 * @date 2018-07-05
 * @time 14:51
 */
public interface AccountService {

    List<Map<String,Object>> myQuery();

    List<Account> queryAll();

    Object page();
}
