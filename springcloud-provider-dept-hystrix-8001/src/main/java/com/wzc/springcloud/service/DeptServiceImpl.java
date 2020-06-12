package com.wzc.springcloud.service;

import com.wzc.springcloud.dao.DeptDao;
import com.wzc.springcloud.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<dept> queryAll() {
        return deptDao.queryAll();
    }


}
