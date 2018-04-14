package com.dem;

import com.dem.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Scopes: singleton and prototype
public class Section6Practice {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Coach coach = context.getBean("baseballCoach", Coach.class);
        Coach coach2 = context.getBean("baseballCoach", Coach.class);

        System.out.println(coach == coach2);
        System.out.println("\n memory location " + coach);
        System.out.println("\n memory location " + coach2);

        context.close();
    }
}
