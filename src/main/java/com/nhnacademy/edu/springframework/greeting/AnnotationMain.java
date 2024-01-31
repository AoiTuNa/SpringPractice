package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.greeting");
        MessageSendService service = context.getBean("messageSendService",MessageSendService.class);
        service.doSendMessage(new User("moonstone@bluehouse.com","011-9989-0927"),"사람이 먼저다");
    }
}
