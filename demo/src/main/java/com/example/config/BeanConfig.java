package com.example.config;

import com.example.controller.AccountController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    
    @Bean
    public AccountController AccountController() {
        return new AccountController();
    }
}
