package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessage;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessage;

public class Main {
    public static void main(String[] args) {
        User user = new User("ppap@mnsk.com","010-2202-2020");
        /*new MessageSendService(new EmailMessage()).doSendMessage(user,"ppap");
        new MessageSendService(new SmsMessage()).doSendMessage(user,"ppapppapppap");*/
    }
}
