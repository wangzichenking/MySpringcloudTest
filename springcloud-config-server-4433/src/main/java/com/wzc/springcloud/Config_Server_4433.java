package com.wzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer         //开启

/*
访问地址：http://localhost:4433/application-dev.yml
 */

public class Config_Server_4433 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Server_4433.class,args);
    }
}
