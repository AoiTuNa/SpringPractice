package com.nhnacademy.edu.springframework.messagesender;

public class User {
    private final String email;
    private String phoneNumber;

    public User (String email, String phoneNumber){
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
