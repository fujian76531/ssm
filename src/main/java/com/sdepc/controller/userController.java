package com.sdepc.controller;/**
 * Created by 437862485@qq.com on 2019/2/20.
 */

import com.sdepc.entity.Userinfo;
import com.sdepc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/20
 * @description：
 */
public class userController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/user/regiter",method = RequestMethod.GET)
    public String regiter(){
        return "register";
    }
    @RequestMapping(value = "/user/regiter",method = RequestMethod.POST)
    public String addUser(@ModelAttribute Userinfo user, Model model){
        Userinfo record=new Userinfo();
        record.setName(user.getName());
        List<Userinfo> list=userInfoService.selectSelective(record);
        return "register";
    }
}
