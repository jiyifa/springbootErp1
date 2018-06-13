package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class DemoApplication extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")//  对接口配置跨域设置
                .allowCredentials(true)
                .allowedHeaders("*")// 允许任何头
                .allowedOrigins("*")// 允许任何域名使用
                .allowedMethods("*");// 允许任何方法（post、get等）

    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
