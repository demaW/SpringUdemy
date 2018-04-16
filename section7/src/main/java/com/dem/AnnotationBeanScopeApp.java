package com.dem;

import com.dem.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);

        System.out.println("Coaches are equal: " + (tennisCoach == tennisCoach2));
        System.out.println("Address 1: " + tennisCoach);
        System.out.println("Address 2: " + tennisCoach2);

        context.close();
    }
}
