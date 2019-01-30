package com.sdepc.dao;

import com.sdepc.model.User;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019/1/30
 * @description：
 */
public interface UserMapper {

    List<User> getAll();

    void save(User user);

    void delete(int id);

    void update(User user);

    User getUserById(int id);

}