package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class MyController {
    @RequestMapping(value = "/hello", method = {RequestMethod.POST, RequestMethod.GET}/*, consumes = "text/html"*/)
//    @PostMapping(value = "/hello")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/WEB-INF/view/hello.jsp");
        modelAndView.setViewName("hello");
        modelAndView.addObject("name", "孙进");
        return modelAndView;
    }
    @RequestMapping(value = "/register")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/hello.jsp");
        modelAndView.addObject("register", "孙进");
        return modelAndView;
    }
    @RequestMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/hello.jsp");
        modelAndView.addObject("login", "孙进");
        return modelAndView;
    }
    @RequestMapping("/query")
//    public ModelAndView query() {
//        User user = new User();
//        user.setPassword("123456");
//        user.setUsername("lanzhao");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("/WEB-INF/view/query.jsp");
//        modelAndView.addObject("user",user);
//        return modelAndView;
//    }
//    public void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        User user = new User();
//        user.setPassword("123456");
//        user.setUsername("lanzhao2");
//        request.setAttribute("user",user);
//        request.getRequestDispatcher("hello").forward(request, response);
//    }
    public String query(Model model){
        User user = new User();
        user.setPassword("123456");
        user.setUsername("lanzhao2");

        model.addAttribute("user",user);
        return "redirect:hello1";
    }
}
