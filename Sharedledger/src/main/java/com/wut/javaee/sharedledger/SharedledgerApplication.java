package com.wut.javaee.sharedledger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类
 */
//Jpa审计
@EnableJpaAuditing
@SpringBootApplication
@RestController
public class SharedledgerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SharedledgerApplication.class, args);
    }
}
