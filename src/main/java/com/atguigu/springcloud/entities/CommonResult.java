package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * json 封装实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T Data;

    /*第三个参数为空的构造方法*/
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }



}
