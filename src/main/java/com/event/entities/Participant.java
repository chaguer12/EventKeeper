package com.event.entities;

public class Participant extends User{
    private User user;


    public User getUser(){
        return this.user;
    }
    public void setUser(User user){
        this.user = user;
    }
}
