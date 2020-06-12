package com.wzc.springcloud.dao;
import com.wzc.springcloud.pojo.dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(dept dept);
    public dept queryById(Long id);
    public List<dept> queryAll();
}
