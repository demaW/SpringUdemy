package com.dem.coach;

import com.dem.fortune.FortuneService;

public class TrackCoach implements Coach {

    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes at tracking";
    }

    @Override
    public String getFortune() {
        return fortuneService.gerFortune();
    }
}
