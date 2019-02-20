package com.sdepc.service.Impl;/**
 * Created by 437862485@qq.com on 2019/2/19.
 */

import com.sdepc.dao.UserinfoMapper;
import com.sdepc.entity.Userinfo;
import com.sdepc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/19
 * @description：
 */
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserinfoMapper userMapper;
    public int insert(Userinfo user) {
        return userMapper.insert(user);
    }

    public ArrayList<Userinfo> selectSelective(Userinfo user) {
        return userMapper.insertSelective(user);
    }
}
