package com.dem.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "30 mins of tennis";
    }

    @Override
    public String getFortune() {
        return null;
    }

}
