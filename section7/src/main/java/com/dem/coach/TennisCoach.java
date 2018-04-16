package com.dem.coach;

import com.dem.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortune")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "30 mins of tennis";
    }

    @Override
    public String getFortune() {
        return fortuneService.gerFortune();
    }
}
