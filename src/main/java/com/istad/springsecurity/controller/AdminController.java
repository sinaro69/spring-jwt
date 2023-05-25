package com.istad.springsecurity.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    // controller works with view engine
    @GetMapping("/homepage")
    @ResponseBody
    public String adminHomePage(){
        return "This is the admin home page ";
    }
    @GetMapping("/feed")
    @ResponseBody
    public String adminFeed(){
        return "this is the admin feed page";
    }

}
