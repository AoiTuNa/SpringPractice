package com.nhnacademy.edu.springframework.greeting.service;

import org.springframework.beans.factory.InitializingBean;

public class EnglishGreeter implements Greeter{
    public EnglishGreeter() {
        System.out.println("EnglishGreeter initiated!!");
    }
    @Override
    public boolean sayHello() {
        System.out.println("Hello World!");
        return true;
    }
    public void init() {
        System.out.println("EnglishGreeter init called!!");
    }

}
