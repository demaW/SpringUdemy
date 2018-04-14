package com.dem.coach;

public class BaseballCoach implements Coach {

    FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getFortune() {
        return "Yeah! " + fortuneService.gerFortune();
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes at baseball game";
    }
}
