package com.neil.mybatis.controller;


import com.neil.mybatis.pojo.Students;
import com.neil.mybatis.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/getStudents")
    public Students getStudent(int id){
        return studentsService.selectStudents(id);
    }

    @GetMapping("/getStudents/{name}")
    public String getByName(@PathVariable String name){
        Students students = studentsService.selByName(name);
        return students.toString();
    }

    @GetMapping(value = "/getStudents/all")
    public List<Students> findAll(){
        List<Students> all = studentsService.findAll();
        return all;
    }

    @PostMapping("/addStudents")
    public int addStudents(@RequestBody String name,@RequestBody int class_id,@RequestBody int school_id){
        Students students = new Students();
        students.setSchool_id(school_id);
        students.setClass_id(class_id);
        students.setNickname(name);
        return 200;
    }
}
