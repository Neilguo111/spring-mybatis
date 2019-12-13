package com.neil.mybatis.service.impl;

import com.neil.mybatis.mapper.WechatUserMapper;
import com.neil.mybatis.pojo.WechartUser;
import com.neil.mybatis.service.WechartUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class WechartUserServiceImpl implements WechartUserService {

    @Autowired
    private WechatUserMapper mapper;

    @Override
    public WechartUser getUserById(int id) {
        if (ObjectUtils.isEmpty(id)){
            return null;
        }
        if (!getAllUserId().contains(id)){
            return null;
        }
        WechartUser user = mapper.getUserById(id);
        return user;
    }

    @Override
    public List<Integer> getAllUserId() {
        List<Integer> allUserId = mapper.getAllUserId();
        return allUserId;
    }

    @Override
    public List<WechartUser> getUserByIds(int[] ids) {
        List<WechartUser> users = new ArrayList<>();
        for (int i = 0;i < ids.length;i++){
            users.add(getUserById(i));
        }
        return users;
    }
}
