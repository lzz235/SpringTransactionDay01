package com.zzc.dao;

import com.zzc.entity.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author liu
 * @Date 2020/12/24 14:04
 */
public interface EmpDao {
    @Select("select * from emp")
    List<Emp> findAll();
    @Insert("insert into Emp(name,job,sal,deptno) values(#{name},#{job},#{sal},#{deptno})")
    void insert(Emp emp);

}
