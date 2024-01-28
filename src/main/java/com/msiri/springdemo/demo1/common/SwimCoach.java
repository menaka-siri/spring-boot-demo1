package com.msiri.springdemo.demo1.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "SWim 1000 meters as a warm up";
    }
}
