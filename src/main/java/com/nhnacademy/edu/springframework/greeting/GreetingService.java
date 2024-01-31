package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.greeting.annotation.GreeterQualifier;
import com.nhnacademy.edu.springframework.greeting.annotation.Lang;
import com.nhnacademy.edu.springframework.greeting.annotation.Language;
import com.nhnacademy.edu.springframework.greeting.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class GreetingService {
    //    @Autowired
    private Greeter greeter;
    /*public GreetingService() {
    }
*/
    @Value("${from}")
    private String from;

    /*public GreetingService(Greeter greeter) {
        System.out.println("--------------------------------------");
        this.greeter = greeter;
    }*/

    @Autowired
    public GreetingService(@GreeterQualifier(language = Language.ENGLISH, dummy = false) Greeter greeter) {
        this.greeter = greeter;
    }


    /*public void setKoreanGreeter(Greeter greeter) {
        System.out.println("setGreeter invoked!");
        this.greeter = greeter;
    }
*/
    public boolean greet() {
        System.out.println("From : " + from);
        return greeter.sayHello();
    }
}
