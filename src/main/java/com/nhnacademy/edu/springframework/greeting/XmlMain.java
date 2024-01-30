package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.greeting.service.Greeter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            Greeter koreanGreeter = context.getBean("koreanGreeter", Greeter.class);
            Greeter englishGreeter = context.getBean("englishGreeter", Greeter.class);

            koreanGreeter.sayHello();
            englishGreeter.sayHello();
        }
    }
}
