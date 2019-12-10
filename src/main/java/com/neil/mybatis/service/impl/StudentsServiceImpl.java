package com.neil.mybatis.service.impl;

import com.neil.mybatis.mapper.StudentsMapper;
import com.neil.mybatis.pojo.Students;
import com.neil.mybatis.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper mapper;

    @Override
    public Students selectStudents(int id) {
        return mapper.selectStudents(id);
    }

    @Override
    public Students selByName(String name) {
        return mapper.selByName(name);
    }

    @Override
    public List<Students> findAll() {
        return mapper.findAll();
    }

    @Override
    public int insertStudent(int id, String nickname, int school_id, int class_id) {
        try{
            mapper.insertStudent(id,nickname,school_id,class_id);
            return 200;
        }catch (Exception e){
            return 40000;
        }
    }

    @Override
    public void addStudent(Students students) {
        try{
            mapper.addStudents(students);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String updateStudent(Students students) {
        int id = 0;
        String nickname = null;
        int school_id = 0;
        int class_id = 0;
        try {
            id = students.getId();
            nickname = students.getNickname();
            school_id = students.getSchool_id();
            class_id = students.getClass_id();
        }catch (Exception e){
            e.printStackTrace();
        }
        Students newStudent = new Students();
        newStudent.setNickname(nickname);
        newStudent.setClass_id(class_id);
        newStudent.setSchool_id(school_id);
        newStudent.setId(id);
        try{
            mapper.updateStudent(newStudent);
            return "修改成功";
        }catch (Exception e){
            return "修改失败";
        }
    }

    @Override
    public int deleteStudent(int studentId) {
        if (ObjectUtils.isEmpty(studentId)){
            return 40000;
        }
        mapper.deleteStudent(studentId);
        return 200;
    }
}
