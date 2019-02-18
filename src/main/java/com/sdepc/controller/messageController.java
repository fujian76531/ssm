package com.sdepc.controller;/**
 * Created by 437862485@qq.com on 2019/2/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/15
 * @description：
 */
@Controller
public class messageController {
    @RequestMapping("/massage/go")
    public String goTest(){
        return "reach";
    }
}
