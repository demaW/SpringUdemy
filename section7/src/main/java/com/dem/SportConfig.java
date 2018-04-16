package com.dem;

import com.dem.coach.Coach;
import com.dem.coach.SwimCoach;
import com.dem.fortune.FortuneService;
import com.dem.fortune.HappyFortune;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.dem")
@PropertySource("classpath:props.properties")
public class SportConfig {

    @Bean
    public FortuneService happyFortune(){
        return new HappyFortune();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(happyFortune());
    }
}
