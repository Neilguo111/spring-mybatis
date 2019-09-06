package com.neil.mybatis.pojo;


import org.springframework.stereotype.Component;

@Component
public class Students {
    private int id;
    private int class_id;
    private String nickname;
    private int school_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", class_id=" + class_id +
                ", nickname='" + nickname + '\'' +
                ", school_id=" + school_id +
                '}';
    }
}
