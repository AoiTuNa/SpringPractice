package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("smsMessage")
public class SmsMessage implements MessageSender{
    public SmsMessage(){
        System.out.println("sms Initialized");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+user.getPhoneNumber() +":"+ message);
    }

    public void init(){
        System.out.println("init method called in SmsMessageSender");
    }
}
