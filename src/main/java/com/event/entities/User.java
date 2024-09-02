package com.event.entities;

public class User {
    private static int idStarter = 0;
    private int id;
    private String name;
    private boolean role;


    public User(String name, boolean role) {
        this.id = idStarter++;
        this.name = name;
        this.role = role;
    }

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
