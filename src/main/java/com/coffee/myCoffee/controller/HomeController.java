package com.coffee.myCoffee.controller;

import com.coffee.myCoffee.Entity.Grade;
import com.coffee.myCoffee.Entity.Member;
import com.coffee.myCoffee.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/coffee")
public class HomeController {

    private final MemberService memberService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("data", "안녕 나의 데이터야!");
        return "template/layout/layoutMain";
    }

    @GetMapping("/user")
    public String user(Model model) {

        Member member = new Member(1L, "memberTest-A", Grade.BASIC);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        model.addAttribute("member", findMember);

        return "template/layout/user";
    }

    @GetMapping("/coffee")
    public String coffee() {
        return "coffee";
    }

}
