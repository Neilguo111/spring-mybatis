package com.neil.mybatis.mapper;


import com.neil.mybatis.pojo.WechartUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WechatUserMapper {

    @Select("select * from sjd_clock_wechat_users where id = #{id}")
    WechartUser getUserById(int id);

    @Select("select id from sjd_clock_wechat_users")
    List<Integer> getAllUserId();

}
