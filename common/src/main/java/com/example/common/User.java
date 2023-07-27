package com.example.common;



import lombok.Data;

import java.io.Serializable;

/**
 * description：TODO
 * time：2023/7/26 22:23
 * auther：zhaopengfei
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}