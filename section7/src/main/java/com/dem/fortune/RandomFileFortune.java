package com.dem.fortune;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RandomFileFortune implements FortuneService {
    @Value("${fortune1}")
    private String fortune1;
    @Value("${fortune2}")
    private String fortune2;
    @Value("${fortune3}")
    private String fortune3;

    @Override
    public String gerFortune() {
        List<String> fortunes = Arrays.asList(fortune1, fortune2, fortune3);
        int index = new Random().nextInt(fortunes.size());
        return fortunes.get(index);
    }


}
