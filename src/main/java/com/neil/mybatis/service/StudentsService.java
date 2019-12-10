package com.neil.mybatis.service;

import com.neil.mybatis.pojo.Students;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentsService {
    Students selectStudents(int id);

//    void insertStudents(Students students);
    Students selByName(String name);

    List<Students> findAll();

    int insertStudent(int id,String nickname,int school_id,int class_id);

    void addStudent(Students students);

    String updateStudent(Students students);

    int deleteStudent(int studentId);
}
