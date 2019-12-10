package com.neil.mybatis.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        PageHelper.startPage(1,3);
        List<Students> all = studentsService.findAll();
        // 得到分页结果
        PageInfo<Students> studentsPageInfo = new PageInfo<>(all);
        // 得到分页中students条目对象
        List<Students> pageList = studentsPageInfo.getList();
        return pageList;
    }

    @PostMapping("/addStudents")
    public int addStudents(@RequestParam("id") int id,@RequestParam(value = "nickname",
            required = false) String nickname,
                           @RequestParam("school_id") int school_id,
                           @RequestParam("class_id") int class_id){
        Students students = new Students();
        students.setSchool_id(school_id);
        students.setClass_id(class_id);
        students.setId(id);
        students.setNickname(nickname);
        studentsService.addStudent(students);
        System.out.println(students.toString());
        return 200;
    }


//    @RequestMapping
//    @ResponseBody
//    public int addStudents(@RequestBody Students students){
//        if (StringUtils.isEmpty(students.getNickname())){
//            return 401;
//        }
//        studentsService.addStudent(students);
//        return 200;
//    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int createStudent(@RequestBody Students students){
        studentsService.addStudent(students);
        return 200;
    }


    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String updateStudent(@RequestBody Students students){
        try{
            studentsService.updateStudent(students);
            return "修改成功";
        }catch (Exception e){
            return "修改失败";
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public int deleteStudent(@PathVariable(name = "id") int id){
        try {
            studentsService.deleteStudent(id);
            return 200;
        }catch (Exception e){
            return 40000;
        }
    }
}
