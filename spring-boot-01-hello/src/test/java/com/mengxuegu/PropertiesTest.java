package com.mengxuegu;


import com.mengxuegu.entry.Emp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Autowired
    private Emp emp;
    @Test
    public void test(){
        System.out.println(emp);
    }
}
