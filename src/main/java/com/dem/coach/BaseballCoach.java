package com.dem.coach;

import com.dem.fortune.FortuneService;

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

    public void initCoach(){
        System.out.println("Creating coach");
    }

    public void destroyCoach(){
        System.out.println("destroying coach");
    }
}
