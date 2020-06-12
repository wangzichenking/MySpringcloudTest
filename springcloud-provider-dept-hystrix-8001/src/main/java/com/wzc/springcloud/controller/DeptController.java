package com.wzc.springcloud.controller;

//提供Restful服务

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wzc.springcloud.pojo.dept;
import com.wzc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixget")
    public dept get(@PathVariable("id") Long id){
        dept dept = deptService.queryById(id);
        if (dept == null){
            throw new RuntimeException("This id"+id+"有异常!");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<dept> get(){
        return deptService.queryAll();
    }

    //Hystrix的备选方案
    public dept hystrixget(@PathVariable("id") Long id){
        return new dept().setDeptno(id)
                .setDname("This id"+id+"没有对应的信息~")
                .setDb_source("没有这个数据库");
    }
}
