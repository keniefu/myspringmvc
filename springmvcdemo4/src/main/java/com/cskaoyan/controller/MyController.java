package com.cskaoyan.controller;

import com.cskaoyan.bean.Stu;
import com.cskaoyan.bean.User;
import com.cskaoyan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class MyController {
    @RequestMapping("/register")
    public ModelAndView myRegister(User user, MultipartFile headpic, String checkcode, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        if (checkcode == null || !"bnksu".equalsIgnoreCase(checkcode)) {
            modelAndView.setViewName("fail");
            return modelAndView;
        }
        try {
            String name = headpic.getOriginalFilename();
            long size = headpic.getSize();
            if (!(name.endsWith(".jpg")||name.endsWith(".png")) || size > 500*1024 || user.getBirthday() == null)
                throw new IOException();
            String s = UUID.randomUUID().toString();
            String contextPath = request.getServletContext().getRealPath("\\upload");
//            System.out.println(contextPath);
            String path = s+name;
            File file = new File(contextPath+"\\"+path);
            headpic.transferTo(file);
            user.setHeadPicUrl(path);
            System.out.println(path);
            modelAndView.addObject("user",user);
        } catch (IOException e) {
            e.printStackTrace();
            modelAndView.setViewName("fail");
            return modelAndView;
        }
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/smjb")
    public ModelAndView mySmjb(Stu stu) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("stu", stu);
        modelAndView.setViewName("stu");
        return modelAndView;
    }
    @Autowired
    AccountService accountService;
    @RequestMapping("/transfer")
    public ModelAndView myTransfer(String from, String to, double money) {
        ModelAndView modelAndView = new ModelAndView();
        boolean b = accountService.transferMoney(from, to, money);
        if (b) {
            modelAndView.setViewName("s");
        } else {
            modelAndView.setViewName("f");
        }
        return modelAndView;
    }


}
