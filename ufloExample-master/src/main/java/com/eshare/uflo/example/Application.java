package com.eshare.uflo.example;

import com.bstek.uflo.console.UfloServlet;
import com.eshare.uflo.example.filter.TestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableAutoConfiguration
@ImportResource("classpath:context.xml")
@ComponentScan("com/eshare/uflo/example")
public class Application {
     public static void main(String[] args){
         SpringApplication.run(Application.class,args);
     }

    @Bean
    public ServletRegistrationBean buildUfloServlet(){
        return new ServletRegistrationBean(new UfloServlet(),"/uflo/*");
    }

    @Bean
    public FilterRegistrationBean buildTestFilter(){
         FilterRegistrationBean bean = new FilterRegistrationBean();
         bean.setFilter(new TestFilter());
         bean.addUrlPatterns("/*");
         return bean;
    }

}
