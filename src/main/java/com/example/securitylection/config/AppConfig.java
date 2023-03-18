package com.example.securitylection.config;

import com.example.securitylection.service.UserService;
import com.example.securitylection.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}
