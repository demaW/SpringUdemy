package com.dem;

import com.dem.coach.Coach;
import com.dem.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        System.out.println("File exists " + Files.exists(Paths.get("src/main/resources/applicationContext")));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getFortune());

        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getFortune());

        context.close();
    }
}
