package com.dem.fortune;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService  {

    @Override
    public String gerFortune() {
        return "Go for it!";
    }
}
