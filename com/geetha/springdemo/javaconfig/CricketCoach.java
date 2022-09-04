package com.geetha.springdemo.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice back foot play.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
