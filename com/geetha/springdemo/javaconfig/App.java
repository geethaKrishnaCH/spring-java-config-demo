package com.geetha.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Coach coach = context.getBean("cricketCoach", Coach.class);
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
