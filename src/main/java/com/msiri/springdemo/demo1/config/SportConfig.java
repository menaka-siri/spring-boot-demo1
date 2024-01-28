package com.msiri.springdemo.demo1.config;

import com.msiri.springdemo.demo1.common.Coach;
import com.msiri.springdemo.demo1.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimMenaka() {
        return new SwimCoach();
    }
}

