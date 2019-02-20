package com.sdepc.service;/**
 * Created by 437862485@qq.com on 2019/2/19.
 */

import com.sdepc.entity.Userinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/19
 * @description：
 */
public interface UserinfoService {
    int insert(Userinfo record);

    ArrayList<Userinfo> selectSelective(Userinfo record);
    }
