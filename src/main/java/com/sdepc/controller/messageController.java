package com.sdepc.controller;/**
 * Created by 437862485@qq.com on 2019/2/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/massage/detail/data={uname}")
    public String goDetail(@PathVariable("uname")String data,Model model){
        model.addAttribute("data",data);
        return "detail";
    }

    @RequestMapping(value = "/massage/report",method = RequestMethod.GET)
    public String reportGet(@PathVariable("begin")String begin,
                             @PathVariable("end")String end,Model model){
        model.addAttribute("begin",begin);
        model.addAttribute("end",end);
        model.addAttribute("formType","Get");
        return "report";

    }
}
