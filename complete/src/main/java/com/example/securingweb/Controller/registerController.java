package com.example.securingweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class registerController {
    @RequestMapping({"/signUp"})
    public String signUp() {

        return "signUp";
    }
}
