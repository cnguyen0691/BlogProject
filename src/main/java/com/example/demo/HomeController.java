package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/github")
    public String github() {
        return "github";
    }

    @RequestMapping("/OOP")
    public String OOP() {
        return "OOP";
    }


    @RequestMapping("/Authors")
    public String Authors() {
        return "Authors";
    }


}

