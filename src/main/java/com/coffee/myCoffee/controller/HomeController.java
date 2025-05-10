package com.coffee.myCoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coffee")
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("data", "안녕 나의 데이터야!");
        return "template/layout/layoutMain";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/coffee")
    public String coffee() {
        return "coffee";
    }

}
