package com.example.common;



import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

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



    public static void main(String[] args) {



        List<Integer> integers = Arrays.asList(1, 2);
        integers.forEach(i->{
            System.out.println(i);
        });
//        integers.stream().forEach();
//        Integer i = new Integer(100); int j = 100; System.out.print(i == j);
//        Integer i = 128;
//        Integer j = 128;
//        System.out.print(i == j);
        Long id = 2131442442343345464L;
        id %= 999999;
        System.out.println(id);
    }
}