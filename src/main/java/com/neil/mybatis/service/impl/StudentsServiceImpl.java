package com.neil.mybatis.service.impl;

import com.neil.mybatis.mapper.StudentsMapper;
import com.neil.mybatis.pojo.Students;
import com.neil.mybatis.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
