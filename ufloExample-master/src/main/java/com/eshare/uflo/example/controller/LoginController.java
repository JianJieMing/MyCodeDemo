package com.eshare.uflo.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname LoginController
 * @Date 2019/1/9 10:22
 * @Created by jianjieming
 */
@RestController
public class LoginController {

    @PostMapping("login")
    public Object login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.trim().isEmpty() || password.trim().isEmpty()) {
            throw new RuntimeException("Login Fail!");
        }
        request.getSession().setAttribute("loginUser", username);
        return null;
    }

}
