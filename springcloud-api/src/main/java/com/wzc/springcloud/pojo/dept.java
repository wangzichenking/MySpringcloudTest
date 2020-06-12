package com.wzc.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/*
这是我的push的测试
 */


@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
//实体类
public class dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;

    public dept(String dname){
        this.dname = dname;
    }
}
