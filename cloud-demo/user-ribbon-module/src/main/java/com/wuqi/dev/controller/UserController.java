package com.wuqi.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 创建人: 武奇
 * 创建事件: 2018/11/19
 */
@RestController
@RequestMapping("/auth")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/home")
    public String home() {
        return this.restTemplate.getForObject("http://user-module/auth/home", String.class);
    }

}
