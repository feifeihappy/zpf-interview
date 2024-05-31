package com.example.dubbo.controller;

import com.example.common.User;
import com.example.common.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description：TODO
 * time：2023/7/26 22:26
 * auther：zhaopengfei
 */
@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @RequestMapping("/user")
    public User getUser() {
        return userService.getUser();
    }

    @RequestMapping("/getStudent")
    public List<Map<String,Object>> getStudent() {
        return userService.getStudent();
    }
}
