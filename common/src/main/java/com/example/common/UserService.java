package com.example.common;

import java.util.List;
import java.util.Map;

/**
 * description：TODO
 * time：2023/7/26 22:24
 * auther：zhaopengfei
 */
public interface UserService {
    User getUser();
    List<Map<String,Object>> getStudent();
    List<Map<String,Object>> getStudents();
}
