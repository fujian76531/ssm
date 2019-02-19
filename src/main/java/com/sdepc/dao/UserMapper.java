package com.sdepc.dao;

import com.sdepc.entity.User;

import java.util.ArrayList;

public interface UserMapper {
    int insert(User record);

    ArrayList<User> insertSelective(User record);
}