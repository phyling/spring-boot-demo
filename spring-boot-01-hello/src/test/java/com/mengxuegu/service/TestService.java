package com.mengxuegu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
    @Autowired
    private EmpService empService;
    @Test
    public void setEmpService(){
        empService.excute();
    }

    @Autowired
    private EmpService2 empService2;
    @Test
    public void testEmpService2(){
        empService2.empService2();
    }

    @Autowired
    private EmpService1 empService1;
    @Test
    public void testEmpService1(){
        empService1.empService1();
    }
}
