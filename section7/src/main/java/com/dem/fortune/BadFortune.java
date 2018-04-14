package com.dem.fortune;

public class BadFortune implements FortuneService  {

    @Override
    public String gerFortune() {
        return "Not today, buddy";
    }
}
