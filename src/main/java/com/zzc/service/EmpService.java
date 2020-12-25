package com.zzc.service;

import com.zzc.entity.Emp;

import java.io.IOException;
import java.util.List;

/**
 * @Author liu
 * @Date 2020/12/24 14:10
 */
public interface EmpService {
    void insertEmp(Emp emp) throws IOException;
    List<Emp> findAll();//kjgkj
}
