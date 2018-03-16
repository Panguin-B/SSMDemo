package com.bobbi.mapper;

import com.bobbi.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by bobbi on 18/3/16.
 */
public interface StudentMapper {

    List<Student> findAllStudent();

    int insertStudent(@Param("username") String username,
                      @Param("address") String address);

}
