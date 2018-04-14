package com.dem.coach;

public class BadFortune implements FortuneService  {

    @Override
    public String gerFortune() {
        return "Not today, buddy";
    }
}
