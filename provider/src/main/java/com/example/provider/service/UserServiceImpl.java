package com.example.provider.service;

/**
 * description：TODO
 * time：2023/7/26 22:25
 * auther：zhaopengfei
 */

import com.example.common.User;
import com.example.common.UserService;
import com.example.provider.entity.Student;
import com.example.provider.mapper.StudentMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.aop.framework.AopContext;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Jie
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 实现 UserService 的 getUser() 方法
     *
     * @return 返回一个 User
     */
    @Override
    public User getUser() {
        return new User(20, "喵喵", "123456");
    }

    @Transactional
    public List<Map<String, Object>> getStudent() {
        Student student = new Student();
        student.setUserId(5);
        student.setSubject1("地理");
        student.setScore(74);
        studentMapper.insert(student);
        System.out.println("");
        ((UserService) AopContext.currentProxy()).getStudents();
//        throw new RuntimeException("Transactional 测试");
        return studentMapper.getStudent();
    }

    @Transactional
    public List<Map<String, Object>> getStudents(){
        System.out.println("");
        return null;
    }


}