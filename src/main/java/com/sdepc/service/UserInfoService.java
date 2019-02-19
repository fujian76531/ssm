package com.sdepc.service;/**
 * Created by 437862485@qq.com on 2019/2/19.
 */

import com.sdepc.entity.User;

import java.util.ArrayList;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/19
 * @description：
 */
public interface UserInfoService {
    int insert(User userinfo);
    ArrayList<User> selectSelective(User user);
    }
