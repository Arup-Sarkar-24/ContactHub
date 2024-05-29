package com.mycompany.contacthub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("home page handler");
        model.addAttribute("pageName","home");
        model.addAttribute("address","localhost");
        model.addAttribute("url","8081");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model){
        System.out.println("about page handler");
        model.addAttribute("pageName","About");
        return "about";
    }

    @RequestMapping("/services")
    public String services(Model model){
        System.out.println("service page handler");
        model.addAttribute("pageName","Service");
        return "services";
    }

    @RequestMapping("/contact")
    public String contact(Model model){
        System.out.println("contact page handler");
        model.addAttribute("pageName","Contact");
        return "contact";
    }
}
