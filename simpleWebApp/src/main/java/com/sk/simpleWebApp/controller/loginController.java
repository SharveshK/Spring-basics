package com.sk.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @RequestMapping("/login")
        public String Login(){
            return "Welcome to login page";
        }
    }

