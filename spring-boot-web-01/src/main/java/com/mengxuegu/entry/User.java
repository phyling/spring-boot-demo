package com.mengxuegu.entry;

import lombok.Data;

@Data
public class User {
    public User(){}

    public User(String username, Integer gender) {
        this.username = username;
        this.gender = gender;
    }

    private String username;
    private Integer gender;
}
