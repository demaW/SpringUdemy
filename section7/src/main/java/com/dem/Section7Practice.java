package com.dem;

import com.dem.coach.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Scopes: singleton and prototype
public class Section7Practice {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getFortune());
        context.close();
    }
}
