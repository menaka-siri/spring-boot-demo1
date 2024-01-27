package com.msiri.springdemo.demo1.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 30mins in racket practice";
    }
}
