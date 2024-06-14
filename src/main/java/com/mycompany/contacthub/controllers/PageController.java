package com.mycompany.contacthub.controllers;

import com.mycompany.contacthub.forms.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/login")
    public String login(Model model){
        System.out.println("login page handler");
        model.addAttribute("pageName","Login");
        return "login";
    }

    @RequestMapping("/register")
    public String register(Model model){
        System.out.println("register page handler");
        model.addAttribute("pageName","Contact");
        UserForm userForm = new UserForm();
        userForm.setName("Arup");
        //we can use default data also
        model.addAttribute("userForm",userForm);
        return "register";
    }

    //processing register form

    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    public String processRequest(@ModelAttribute UserForm userForm){
        System.out.println("Processing Register");
        //fetch form data
        //userForm
        //validate data
        //save to database
        //message = "Registration Successful"
        //redirect login page
        return "redirect:/register";

    }
}
