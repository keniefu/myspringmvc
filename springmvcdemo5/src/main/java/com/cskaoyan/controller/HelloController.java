package com.cskaoyan.controller;

import com.cskaoyan.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String helloC(Model model) throws MyException {
        if (true) {
            throw new MyException("除零异常");
        }
        model.addAttribute("name", "paul");
        return "hello";
    }
}
