package com.example.provider.mapper;

import com.example.provider.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ht
 * @since 2023-07-30
 */

public interface StudentMapper extends BaseMapper<Student> {

    public List<Map<String, Object>> getStudent();
}
