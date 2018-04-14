package com.dem.coach;

import com.dem.fortune.FortuneService;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String email;
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 30 minutes with" +
                "\n Trainer email: " + getEmail() +
                "\n Team: " + getTeam();
    }

    @Override
    public String getFortune() {
        return fortuneService.gerFortune() + "with cricket";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
