package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.messagesender");
        MessageSendService service = context.getBean("messageSendService",MessageSendService.class);
        service.doSendMessage(new User("ppapp@123","12456"),"사람이 먼저다");
    }

}
