package com.dem;

import com.dem.coach.Coach;
import com.dem.coach.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Scopes: singleton and prototype
public class Section10Practice {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getFortune());

        swimCoach.getCoachInfo();
        context.close();
    }
}
