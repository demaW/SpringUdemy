package com.dem.fortune;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements FortuneService  {

    @Override
    public String gerFortune() {
        return "Not today buddy...";
    }
}
