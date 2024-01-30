package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessage implements MessageSender{
    public EmailMessage(){
        System.out.println("Email Initialized");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to "+user.getEmail() +":"+ message);
    }
    public void destroy(){
        System.out.println("destroy method called in EmailMessageSender");
    }
}
