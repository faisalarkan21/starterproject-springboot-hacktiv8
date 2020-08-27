package com.example.securingweb.Controller;


import com.example.securingweb.DAO.userDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
    @Autowired
    private userDAO userDAO;

    @GetMapping
    @RequestMapping({"/login"})
    public String login() {

        return "login";
    }
}
