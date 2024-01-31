package com.nhnacademy.edu.springframework.messagesender.configuration;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework.messagesender"})
@PropertySource("classpath:messagePhonenumber.properties")

public class MainConfig {
    /*@Bean("smsMessage")
    public MessageSender smsMessage(){
        return new SmsMessage();
    }*/
    @Autowired
    private MessageSender smsMessage;
    public MessageSendService messageSendService() {
        return new MessageSendService(smsMessage);
    }
}
