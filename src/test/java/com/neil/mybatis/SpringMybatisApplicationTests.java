package com.neil.mybatis;

import com.neil.mybatis.mapper.StudentsMapper;
import com.neil.mybatis.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTests {
    @Mapper
    private StudentsMapper mapper;
    @Test
    public void contextLoads() {
        Students students = mapper.selectStudents(1);
        System.out.println(students.toString());
    }

}
