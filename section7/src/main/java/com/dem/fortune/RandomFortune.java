package com.dem.fortune;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortune implements FortuneService {
    @Override
    public String gerFortune() {
        List<FortuneService> fortunes = Arrays.asList(new HappyFortune(), new GoFortune(), new BadFortune());
        int index = new Random().nextInt(fortunes.size());
        return fortunes.get(index).gerFortune();
    }


}
