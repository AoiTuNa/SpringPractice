package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.greeting.service.Greeter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
       /* try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

            System.out.println("---------");
            new GreetingService(context.getBean("koreanGreeter", Greeter.class)).greet();
            System.out.println("---------");
            new GreetingService(context.getBean("koreanGreeter", Greeter.class)).greet();
            System.out.println("---------");
            new GreetingService(context.getBean("englishGreeter", Greeter.class)).greet();
            System.out.println("---------");
            new GreetingService(context.getBean("englishGreeter", Greeter.class)).greet();
            System.out.println("---------");
        }*/
    }
}
