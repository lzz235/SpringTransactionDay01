package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.annotation.Before;

/**
 * @Author liu
 * @Date 2020/12/24 13:58
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String name;
    private String job;
    private Double sal;
    private Integer deptno;
}
