package com.jianjieming.demo.uflodemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

//@EntityScan({
//        "com.bstek.uflo.model"
//})
@ImportResource(locations = {"classpath:uflo-console-context.xml"})
@SpringBootApplication
public class UfloDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(UfloDemo01Application.class, args);
    }

}

