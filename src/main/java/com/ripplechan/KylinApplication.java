package com.ripplechan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author RippleChan
 * @date 2018-07-05
 * @time 14:36
 */
@SpringBootApplication
@MapperScan("com.ripplechan.mapper")
public class KylinApplication {

    public static void main(String[] args) {
        SpringApplication.run(KylinApplication.class, args);
    }

}
