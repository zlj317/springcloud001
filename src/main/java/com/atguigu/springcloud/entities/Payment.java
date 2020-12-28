package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //get set方法注解类
@AllArgsConstructor //有参构造方法
@NoArgsConstructor //无参构造方法
public class Payment {
    private Long id;
    private String serial;
}

