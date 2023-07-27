package com.example.provider.service;

/**
 * description：TODO
 * time：2023/7/26 22:25
 * auther：zhaopengfei
 */

import com.example.common.User;
import com.example.common.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Jie
 */
@DubboService
public class UserServiceImpl implements UserService {

    /**
     * 实现 UserService 的 getUser() 方法
     * @return 返回一个 User
     */
    @Override
    public User getUser() {
        return new User(20,"喵喵","123456");
    }

}