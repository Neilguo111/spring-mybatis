package com.neil.mybatis.service;

import com.neil.mybatis.pojo.WechartUser;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.tools.Klist;

import java.util.List;

@Service
public interface WechartUserService {

    WechartUser getUserById(int id);

    List<Integer> getAllUserId();

    List<WechartUser> getUserByIds(int[] ids);
}
