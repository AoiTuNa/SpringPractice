package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Service;

@Service
public interface MessageSender {
    void sendMessage(User user, String message);
}
