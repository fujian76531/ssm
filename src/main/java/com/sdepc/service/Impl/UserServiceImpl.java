package com.sdepc.service.Impl;/**
 * Created by 437862485@qq.com on 2019/1/30.
 */

import com.sdepc.dao.UserMapper;
import com.sdepc.model.User;
import com.sdepc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019/1/30
 * @description：
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    public List<User> getAll() {
        return userMapper.getAll();
    }

    public void save(User user) {
        userMapper.save(user);
    }

    public void delete(int id) {
        userMapper.delete(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}