package com.neil.mybatis.mapper;

import com.neil.mybatis.pojo.Students;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentsMapper {
    Students selectStudents(int id);

    Students selByName(String name);

    List<Students> findAll();

    @Insert("insert into students(id,nickname,class_id,school_id) values(#{id},#{nickname},#{class_id},#{school_id})")
    int insertStudent(@Param("id") int id,@Param("nickname") String name,@Param("school_id") int school_id,@Param("class_id") int class_id);

//    @Insert("insert into students(id,nickname,class_id,school_id)) values(#{id},#{nickname},#{class_id},#{school_id})")
    void addStudents(Students students);

    // 更新学员
    String updateStudent(Students students);

    // 删除学员
    int deleteStudent(int StudentId);

}
