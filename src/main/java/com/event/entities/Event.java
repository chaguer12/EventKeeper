package com.event.entities;

public class Event {
    private static int id_starter = 0;
    private int id;
    private String name;
    private String location;
    private String date;

    public Event(String eventName, String eventLocation, String eventDate) {
        this.id = id_starter++;
        this.name = eventName;
        this.location = eventLocation;
        this.date = eventDate;
    }

    @Override
    public String toString() {
        return String.format("Event{id='%d', name='%s', location='%s', date='%s'}",id, name, location, date);
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
}
