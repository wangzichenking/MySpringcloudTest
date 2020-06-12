package com.wzc.springcloud.controller;

//提供Restful服务

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

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public dept get(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<dept> queryAll(){
        return deptService.queryAll();
    }

    //注册进来的微服务，获取一些信息
//    @GetMapping("/dept/discovery")
//    public Object discovery(){
//        List<String> services =  client.getServices();
//        System.out.println("discovery=>services："+services);
//
//        //得到具体的微服务信息
//        List<ServiceInstance> instances =  client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
//        for (ServiceInstance instance : instances) {
//            System.out.println(instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
//        }
//        return this.client;
//    }
}
