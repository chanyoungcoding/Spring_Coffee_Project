package com.coffee.myCoffee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String home() {
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
