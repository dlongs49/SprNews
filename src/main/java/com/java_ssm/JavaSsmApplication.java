package com.java_ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.java_ssm.mapper")
public class JavaSsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaSsmApplication.class, args);
    }
}

