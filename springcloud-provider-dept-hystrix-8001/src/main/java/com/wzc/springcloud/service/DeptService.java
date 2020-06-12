package com.wzc.springcloud.service;

import com.wzc.springcloud.pojo.dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(dept dept);
    public dept queryById(Long id);
    public List<dept> queryAll();
}
