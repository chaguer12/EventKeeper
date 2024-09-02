package com.event.entities;

public class Inscription {
    private static int id_starter = 0 ;
    private int id;
    private Participant participant;
    private Event event;

    public Inscription(Participant participant, Event event) {
        this.id = id_starter++;
        this.participant = participant;
        this.event = event;

    }
    @Override
    public String toString(){
        return String.format("Inscription {id = %d, participant = %s, event = %s}", id, participant, event);
    }

    public int getId() {
        return id;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
