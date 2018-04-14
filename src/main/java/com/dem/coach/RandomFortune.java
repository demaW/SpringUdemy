package com.dem.coach;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortune implements FortuneService {
    @Override
    public String gerFortune() {
        List<FortuneService> fortunes = Arrays.asList(new HappyFortune(), new GoFortune(), new BadFortune());
        int index = new Random().nextInt(3);
        return fortunes.get(index).gerFortune();
    }


}
