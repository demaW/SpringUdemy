package com.dem;

import com.dem.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Scopes: singleton and prototype
public class Section7Practice {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getFortune());
        context.close();
    }
}
