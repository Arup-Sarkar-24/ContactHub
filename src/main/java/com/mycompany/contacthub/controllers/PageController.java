package com.mycompany.contacthub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("home page handler");
        model.addAttribute("name","Substring names");
        model.addAttribute("address","localhost");
        model.addAttribute("url","8081");
        return "home";
    }
}
