package com.event.services;

import com.event.entities.Event;

import java.util.ArrayList;
import java.util.List;

public class EventService {
    private static List<Event> events = new ArrayList<>();

    public static void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added: " + event);
    }
    public static List<Event> getEvents() {
        return events;
    }
    public static void showEvents() {
        if(events.isEmpty()){
            System.out.println("====\tNO EVENTS FOUND\t====");
        }else{
            for(Event event : events){
                System.out.println(event);
            }
        }
    }



}
