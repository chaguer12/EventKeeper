package com.event.entities;

public class Participant extends User{
    public Participant(String name){
        super(name,false);
    }

    @Override
    public String toString() {
        return String.format("Particpant{id='%d', name='%s', role='%s'}",getId(),getName(),getRole());
    }



}
