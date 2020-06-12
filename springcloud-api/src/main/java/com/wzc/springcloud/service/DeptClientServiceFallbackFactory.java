package com.wzc.springcloud.service;

import com.wzc.springcloud.pojo.dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

//用于服务降级
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public dept queryById(Long id) {
                return new dept().setDeptno(id).setDname("id："+id+"没有对应的信息").setDb_source("没有数据");
            }

            @Override
            public List<dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(dept dept) {
                return false;
            }
        };
    }
}
