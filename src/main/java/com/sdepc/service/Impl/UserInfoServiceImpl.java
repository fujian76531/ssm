package com.sdepc.service.Impl;/**
 * Created by 437862485@qq.com on 2019/2/19.
 */

import com.sdepc.dao.UserMapper;
import com.sdepc.entity.User;
import com.sdepc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/19
 * @description：
 */
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;
    public int insert(User user) {
        return userMapper.insert(user);
    }

    public ArrayList<User> selectSelective(User user) {
        return userMapper.insertSelective(user);
    }
}
