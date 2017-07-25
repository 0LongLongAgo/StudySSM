package com.lq.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        System.out.println("IndexController");
        model.addAttribute("Title", "index");
        model.addAttribute("END", "内容");
        return "/index";
    }
}