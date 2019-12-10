package com.neil.mybatis;

import com.neil.mybatis.mapper.StudentsMapper;
import com.neil.mybatis.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTests {
    @Autowired
    private StudentsMapper mapper;
    @Test
    public void contextLoads() {
        int neil = mapper.insertStudent(6,"neilguo", 2, 3);
        System.out.println(neil);
        Students james = mapper.selByName("neilguo");
        List<Students> all = mapper.findAll();
        for(Students s:all){
            System.out.println(s);
        }
        Assert.assertEquals(james.getClass_id(),3);
    }

}
