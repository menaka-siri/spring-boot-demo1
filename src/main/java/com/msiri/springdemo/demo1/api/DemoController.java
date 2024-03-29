package com.msiri.springdemo.demo1.api;

import com.msiri.springdemo.demo1.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    /*
    //setter injection demo
    @Autowired
    public void doSomeStuff (Coach theCoach) {
        myCoach = theCoach;
    }
     */

    @GetMapping("/dailyworkout")
    public  String getDailyWorkout() {
        return  myCoach.getDailyWorkout();
    }
}
