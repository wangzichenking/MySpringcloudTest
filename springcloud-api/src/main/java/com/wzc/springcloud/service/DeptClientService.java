package com.wzc.springcloud.service;

import com.wzc.springcloud.pojo.dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 服务熔断:服务端——某个服务超时或者异常，引起熔断
 * 服务降级:客户端——从整体网站请求负载考虑，当某个服务器熔断或者关闭之后，服务将不会再被调用
 *         此时在客户端，可以准备一个FallbackFanctory，返回一个默认值，整体服务水平下降
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    public dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<dept> queryAll();

    @GetMapping("/dept/add")
    public boolean addDept(dept dept);
}
