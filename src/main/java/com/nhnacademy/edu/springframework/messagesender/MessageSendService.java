package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageSendService")
public class MessageSendService {
    private MessageSender messageSender;

    private String phoneNum;


    /*public MessageSendService(){

    }*/
    public MessageSendService(@Qualifier("smsMessage") MessageSender messageSender){
        this.messageSender = messageSender;
    }
    /*public void setsmsMessage(MessageSender messageSender){
        this.messageSender = messageSender;
    }
*/
    public void doSendMessage(User user, String message){
        user.setPhoneNumber(phoneNum);
        messageSender.sendMessage(user,message);
    }
}
