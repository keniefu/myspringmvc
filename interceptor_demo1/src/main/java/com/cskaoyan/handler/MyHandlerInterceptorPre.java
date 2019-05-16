package com.cskaoyan.handler;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerInterceptorPre implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String phone = request.getParameter("phone");
        if (phone == null || phone.length() == 0) return false;
        String regix = "^[1]+[3,8]+\\d{9}$";
        if (phone.matches(regix)) {
            return true;
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
        return false;
    }

}
