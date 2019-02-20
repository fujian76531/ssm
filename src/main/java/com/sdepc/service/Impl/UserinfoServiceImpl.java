package com.sdepc.service.Impl;/**
 * Created by 437862485@qq.com on 2019/2/19.
 */

import com.sdepc.dao.UserinfoMapper;
import com.sdepc.entity.Userinfo;
import com.sdepc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/19
 * @description：
 */
@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper mapper;
    public int insert(Userinfo record) {
        return mapper.insert(record);
    }
    public ArrayList<Userinfo> selectSelective(Userinfo record) {
        return mapper.selectSelective(record);
    }
}
