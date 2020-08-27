package com.example.securingweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @GetMapping
    @RequestMapping({"/home", "/"})
    public String main() {
        return "index";
    }

    @GetMapping
    @RequestMapping({"/hello"})
    public String hello() {
        return "hello";
    }
}
