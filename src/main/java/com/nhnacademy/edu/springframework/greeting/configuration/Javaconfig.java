package com.nhnacademy.edu.springframework.greeting.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
    @Bean/*(name = "dbms)*/
    public String dbms(){
        return new String("MYSQL");
    }
}
