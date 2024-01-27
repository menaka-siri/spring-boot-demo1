package com.msiri.springdemo.demo1.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30mins in batting practice";
    }
}
