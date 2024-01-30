package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;

public class MessageSendService {
    private MessageSender messageSender;


    public MessageSendService(){

    }
    public void setsmsMessage(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user,message);
    }
}
