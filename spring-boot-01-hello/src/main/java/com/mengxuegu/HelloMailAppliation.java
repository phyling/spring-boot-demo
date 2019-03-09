package com.mengxuegu;

import com.mengxuegu.service.EmpService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:spring01.xml"})
public class HelloMailAppliation {
    public static void main(String[] args) {
        SpringApplication.run(HelloMailAppliation.class);
    }

    /**
     * 将empService2 加入容器
     * @return bean
     */
    @Bean
    public EmpService2 empService2(){
        return new EmpService2();
    }
}
