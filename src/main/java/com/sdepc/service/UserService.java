package com.sdepc.service;

import com.sdepc.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 437862485@qq.com on 2019/1/30.
 */
@Transactional
public interface UserService {

    List<User> getAll();

    void save(User user);

    void delete(int id);

    void update(User user);

    User getUserById(int id);
}