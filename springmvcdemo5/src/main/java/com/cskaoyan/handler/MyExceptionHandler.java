package com.cskaoyan.handler;

import com.cskaoyan.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionHandler implements HandlerExceptionResolver {
    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof MyException){
            modelAndView.setViewName("error");
            modelAndView.addObject("mes", e.getMessage());
        }
        return modelAndView;
    }
}
