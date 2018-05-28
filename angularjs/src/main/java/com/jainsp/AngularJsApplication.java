package com.jainsp;

import com.jainsp.repository.UserRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class AngularJsApplication {
    @Autowired
    UserRepository userRepository;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/billing").allowedOrigins("http://localhost:4200");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(AngularJsApplication.class, args);
        System.out.println(">>>>>> STARTED THE APPLICATION >>>>>>> ");
    }
}
