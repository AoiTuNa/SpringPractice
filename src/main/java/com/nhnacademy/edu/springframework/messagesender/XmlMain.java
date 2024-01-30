package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            MessageSendService service = context.getBean("messageSendService",MessageSendService.class);
            service.doSendMessage(new User("ppapp@123","12456"),"바아아아아아아아보");
//            context.getBean("emailMessage",MessageSender.class).sendMessage(new User("ppapp@123","12456"),"바아아아아아아아보");
//            context.getBean("emailMessage",MessageSender.class).sendMessage(new User("ppapp@123","12456"),"바아아아아아아아보");
//            context.getBean("smsMessage",MessageSender.class).sendMessage(new User("ppapp@123","12456"),"바아아아아아아아보");
//            context.getBean("smsMessage",MessageSender.class).sendMessage(new User("ppapp@123","12456"),"바아아아아아아아보");
        }
    }
}
