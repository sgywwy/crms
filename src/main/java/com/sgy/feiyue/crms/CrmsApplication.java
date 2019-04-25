package com.sgy.feiyue.crms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sgy.feiyue.crms.common.dao")
public class CrmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmsApplication.class, args);
    }

}
