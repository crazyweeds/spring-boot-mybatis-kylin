package com.ripplechan.mapper;

import com.ripplechan.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author RippleChan
 * @date 2018-07-05
 * @time 14:55
 */
@Repository
public interface AccountMapper {


    List<Map<String,Object>> myQuery();

    List<Account> queryAll();

    List<Account> page();
}
