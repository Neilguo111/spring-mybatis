package com.neil.mybatis.controller;

import com.neil.mybatis.pojo.WechartUser;
import com.neil.mybatis.service.WechartUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class WechartUserController {
    @Autowired
    private WechartUserService service;

    @GetMapping(value = "/User/{id}")
    public WechartUser getUserById(@PathVariable("id") int id){
        WechartUser user = service.getUserById(id);
        return user;
    }

    @GetMapping(value = "/getUsers")
    public List<WechartUser> getUsers(int[] ids){
        List<WechartUser> user = service.getUserByIds(ids);
        return user;
    }
}
