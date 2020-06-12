package com.wzc.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
RestTemplate可以自动配置为使用功能区。要创建负载均衡RestTemplate创建RestTemplate
@Bean并使用@LoadBalanced限定符
 */


@Configuration
public class ConfigBean {

    //配置负载均衡实现RestTemplate
    //IRule
    @Bean
    @LoadBalanced       //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
