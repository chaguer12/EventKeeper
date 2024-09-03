package com.event.services;

import com.event.entities.Event;
import com.event.entities.Inscription;
import com.event.entities.Participant;

import java.util.ArrayList;
import java.util.List;

public class InscriptionService {
    private static List<Inscription> inscriptions = new ArrayList<Inscription>();

    public static Inscription register(Participant participant, Event event) {
        boolean found = inscriptions.stream().anyMatch(inscription -> inscription.getParticipant().equals(participant) && inscription.getEvent().equals(event));
        if (!found) {
            Inscription inscription = new Inscription(participant, event);
            inscriptions.add(inscription);
            return inscription;
        }else{
            System.out.println("\t=====Participant " + participant.getName() + " already exists");
            return null;
        }




    }
    public List<Inscription> getInscriptions() {
        return inscriptions;
    }
    public static void unregister(Participant participant) {
        inscriptions.removeIf(inscription -> inscription.getParticipant().equals(participant));
        System.out.println("\t=====Participant " + participant.getName() + " has been unregistered from events");
    }

    public static void showInscriptions(Participant participant) {
        boolean found = inscriptions.stream().anyMatch(inscription -> inscription.getParticipant().equals(participant));
        if (found){
            for(Inscription inscription : inscriptions){
                if(inscription.getParticipant().equals(participant)){
                    System.out.println("====\t"+inscription);
                }
            }

        }else{
            System.out.println("====NO INSCRIPTION FOUND");
        }
    }
    public static void showInscriptions(Event event) {
        boolean found = inscriptions.stream().anyMatch(inscription -> inscription.getEvent().equals(event));
        if (found){
            for(Inscription inscription : inscriptions){
                if(inscription.getEvent().equals(event)){
                    System.out.println("===="+inscription);
                }
            }
        }
    }
    public static void TotalInscriptions() {

            for(Inscription inscription : inscriptions){

                    System.out.println("===="+inscription);

            }

    }


}
