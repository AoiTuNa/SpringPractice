package com.nhnacademy.edu.springframework.messagesender.configuration;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessage;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework.messagesender"})

public class SenderConfig {
    public MessageSender smsMessage(){
        return new SmsMessage();
    }

    public MessageSender emailMessage() {return new EmailMessage();
    }

}
