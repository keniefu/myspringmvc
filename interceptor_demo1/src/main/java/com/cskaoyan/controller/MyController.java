package com.cskaoyan.controller;

import com.cskaoyan.bean.Result;
import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

@Controller
public class MyController {

    @Autowired
    UserService userService;

    @RequestMapping("register")
    public String myRegister(Model model, User user) {
//        userService.register(user);
        return "hello";
    }

    @RequestMapping("import")
    public String myImport(Model model, MultipartFile mydata, HttpServletRequest request) {
        try {
            String name = mydata.getOriginalFilename();
            String path = request.getServletContext().getRealPath("\\upload");
            path = path + "\\" + name;
            File file = new File(path);
            mydata.transferTo(file);
            userService.importData(file);
        } catch (IOException e) {
            e.printStackTrace();
            return "importfail";
        }
        return "importsuccess";
    }

    @RequestMapping(value = "query", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Result myImport(String phone) {
        Result result = userService.queryPhone(phone);
        return result;
    }
}
