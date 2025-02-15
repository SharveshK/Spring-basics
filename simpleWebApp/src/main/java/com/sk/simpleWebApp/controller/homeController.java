package com.sk.simpleWebApp.controller;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Sk's page";
    }
    @RequestMapping("/about")
    public String about(){
        return "Mfer";
    }
}
