package com.dem.fortune;

import org.springframework.stereotype.Component;

public class GoFortune implements FortuneService {

    @Override
    public String gerFortune() {
        return "GOGOGOGOGOGO!";
    }
}
