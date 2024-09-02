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
    private static  Event findEvent(int id){
        for (Event event : events){
            if(event.getId() == id){
                return event;
            }
        }

        return null;
    }
    public static boolean  updateEvent(int id ,String newName, String newLocation, String newDate){
        Event target = EventService.findEvent(id);
        if(target != null){
            target.setName(newName);
            target.setDate(newLocation);
            target.setLocation(newDate);
            System.out.println("====\tEVENT UPDATED: " + target);
            return true;
        }else{
            System.out.println("====\tEVENT NOT FOUND");
            return false;
        }


    }



}
