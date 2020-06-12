package com.wzc.myRule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule MyRule(){
        //调用自己定义的MyRandomRule
        return new MyRandomRule();
    }


}
