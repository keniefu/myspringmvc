package com.cskaoyan.controller;


import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("login")
    public String login(String username, String password, Model model) {
        boolean login = userService.login(username, password);
        if (login) {
            model.addAttribute("name",username);
            return "hello";
        } else {
            return "login";
        }
    }
}
