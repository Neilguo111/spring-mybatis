package com.neil.mybatis.mapper;

import com.neil.mybatis.pojo.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentsMapper {
    Students selectStudents(int id);

    Students selByName(String name);

    List<Students> findAll();

    int insertStudent(Students students);
}
