package com.neil.mybatis.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class WechartUser implements Serializable {
    private int id;
    private String open_id;
    private String union_id;
    private String nickname;
    private String avatar;
    private int member_id;
    private int consumer_id;
    private int gender;
    private String province;
    private String city;
    private String country;
    private String mobile;
    private String last_ip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getUnion_id() {
        return union_id;
    }

    public void setUnion_id(String union_id) {
        this.union_id = union_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getConsumer_id() {
        return consumer_id;
    }

    public void setConsumer_id(int consumer_id) {
        this.consumer_id = consumer_id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }

    @Override
    public String toString() {
        return "WechartUser{" +
                "id=" + id +
                ", open_id='" + open_id + '\'' +
                ", union_id='" + union_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", member_id=" + member_id +
                ", consumer_id=" + consumer_id +
                ", gender=" + gender +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", mobile='" + mobile + '\'' +
                ", last_ip='" + last_ip + '\'' +
                '}';
    }
}
