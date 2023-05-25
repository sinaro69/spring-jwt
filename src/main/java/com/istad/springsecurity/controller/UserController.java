package com.istad.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/homepage")
    public String userHomepage(){
        return "this is the user homepage !!";
    }
    @GetMapping("/feed")
    public String userFeed(){
        return "This is the user feed !!";
    }


}
