package com.nhnacademy.edu.springframework.greeting.configuration;

import com.nhnacademy.edu.springframework.greeting.GreetingService;
import com.nhnacademy.edu.springframework.greeting.service.Greeter;
import com.nhnacademy.edu.springframework.greeting.service.KoreanGreeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/greeterbean.xml")
public class MainConfig {

    @Bean("koreaGreeter")
    public Greeter koreanGreeter(){
        return new KoreanGreeter();
    }

    @Bean
    public GreetingService greetingService(){
        return new GreetingService(koreanGreeter());
    }
}
