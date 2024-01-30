package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.greeting.service.Greeter;

public class GreetingService {
    private Greeter greeter;

    //    Setter Injection 기본 생성자가 필요하다.
    public GreetingService() {
    }

    public void setGreeter(Greeter greeter) {
        System.out.println("setGreeter invoked!");
        this.greeter = greeter;
    }
   /* private final Greeter greeter;

    public GreetingService(Greeter greeter){
        this.greeter = greeter;
    }*/

    public boolean greet(){
        return greeter.sayHello();
    }
}
