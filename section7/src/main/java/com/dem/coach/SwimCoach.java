package com.dem.coach;

import com.dem.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${coach.email}")
    private String email;
    @Value("${coach.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 min of swimming";
    }

    @Override
    public String getFortune() {
        return fortuneService.gerFortune();
    }

    public void getCoachInfo() {
        System.out.println("Email: " + email +
                "\nTeam: " + team);
    }
}
