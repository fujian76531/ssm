package com.sdepc.controller;/**
 * Created by 437862485@qq.com on 2019/2/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：launcher
 * @date ：Created in 2019/2/15
 * @description：
 */
@Controller
public class messageController {
    @RequestMapping("/user/login")
    public String goTest(){
        return "reach";
    }

    @RequestMapping("/message/detail/data={uname}")
    public String goDetail(@PathVariable("uname")String data, Model model){
        model.addAttribute("data", data);
        return "detail";
    }

    @RequestMapping(value = "/message/report1", method = RequestMethod.GET)
    public String reportGet(@RequestParam("begin") String begin,
                            @RequestParam("end") String end, Model model){
        model.addAttribute("begin", begin);
        model.addAttribute("end", end);
        model.addAttribute("formType", "GET");
        return "report";
    }

    @RequestMapping(value = "/message/report2", method = RequestMethod.POST)
    public String reportPost(@RequestParam("begin") String begin,
                             @RequestParam("end") String end, Model model){
        model.addAttribute("begin", begin);
        model.addAttribute("end", end);
        model.addAttribute("formType", "POST");
        return "report";
    }
}