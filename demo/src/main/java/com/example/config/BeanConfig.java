package com.example.config;

import java.beans.BeanProperty;

public class BeanConfig {
    
    @Bean
    public AccountController AccountController() {
        return new AccountController();
    }
}
