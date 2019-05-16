package com.cskaoyan.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String email = request.getParameter("email");
        if (email == null || email.length() == 0) return false;
        String regix = "^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w{2,3}){1,3})$";
        if (email.matches(regix)) {
            return true;
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
        return false;
    }
}
