package com.event.entities;

public class User {
    private int id;
    private String name;
    private boolean role;

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public boolean getRole(){
        return this.role;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setRole(boolean role){
        this.role = role;
    }


}
