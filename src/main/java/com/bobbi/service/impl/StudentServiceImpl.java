package com.bobbi.service.impl;

import com.bobbi.domain.Student;
import com.bobbi.mapper.StudentMapper;
import com.bobbi.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bobbi on 18/3/16.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent() {

        return studentMapper.findAllStudent();

    }
}
