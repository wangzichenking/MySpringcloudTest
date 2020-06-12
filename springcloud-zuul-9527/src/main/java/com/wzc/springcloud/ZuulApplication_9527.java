package com.wzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * http://localhost:9527/springcloud-provider-dept/dept/list
 * 加上服务端的名字springcloud-provider-dept
 */


@SpringBootApplication
@EnableZuulProxy            //开启Zuul代理
public class ZuulApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_9527.class,args);
    }
}
