package com.zzc.service;

import com.zzc.dao.EmpDao;
import com.zzc.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Author liu
 * @Date 2020/12/24 14:09
 */
//开启事务注解
@Transactional
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;
//    @Transactional
    public void insertEmp(Emp emp) throws IOException {
        empDao.insert(emp);
        FileInputStream fis = new FileInputStream("fos");
        int read = fis.read();
        System.out.println(read);
        int a = 1/0;
        empDao.insert(emp);
    }

    public List<Emp> findAll() {
        List<Emp> emps = empDao.findAll();
        return emps;
    }
}
