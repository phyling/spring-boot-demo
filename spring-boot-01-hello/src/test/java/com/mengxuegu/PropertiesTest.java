package com.mengxuegu;


import com.mengxuegu.entry.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PropertiesTest {
    @Autowired
    private Emp emp;
    @Test
    public void test(){
        System.out.println(emp);
    }

    @Test
    public void testLog(){
        log.info("info --------");
        log.info("debug --------");
        log.error("err --------");
        log.warn("这是 warn 日志信息");
        log.trace("trace");
    }
}
