package com.mengxuegu.service;

import org.springframework.stereotype.Component;

/**
 * 自定义被扫描进spring 容器中的bean
 */
@Component
public class EmpService1 {
    public void empService1(){
        System.out.println("自定义被扫描进spring 容器中的bean=");
    }
}
