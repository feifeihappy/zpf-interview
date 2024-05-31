package com.example.provider.service.impl;

import com.example.provider.entity.Student;
import com.example.provider.mapper.StudentMapper;
import com.example.provider.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ht
 * @since 2023-07-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
