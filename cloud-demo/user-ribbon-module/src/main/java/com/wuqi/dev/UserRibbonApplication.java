package com.wuqi.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 创建人: 武奇
 * 创建事件: 2018/11/19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserRibbonApplication.class, args);
    }
}
