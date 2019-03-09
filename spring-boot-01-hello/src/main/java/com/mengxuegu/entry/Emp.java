package com.mengxuegu.entry;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:emp.properties"})
//yml类型 局部自定义配置文件 @PropertyResource 无效
//@PropertySource(value = {"classpath:emp.properties"})
@Data
@Component
@ConfigurationProperties(prefix = "emp")
@Validated
public class Emp {
    @Email
    private String emali;
    private String lastName;
    private Integer age;
    private Double salary;
    private Boolean boss;
    private Date birthday;
    private Map map;
    private List list;
    //特长
    private Forte forte;

}
