package com.dem.coach;

import com.dem.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFileFortune")
    private FortuneService fortuneService;

    @PostConstruct
    public void postConstruct(){
        System.out.println("Object created");
    }

    @Override
    public String getDailyWorkout() {
        return "30 mins of tennis";
    }

    @Override
    public String getFortune() {
        return fortuneService.gerFortune();
    }

    @Override
    public void getCoachInfo() {

    }
}
