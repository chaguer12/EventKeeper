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
            inscriptions.add(new Inscription(participant, event));

        }else{
            System.out.println("\t=====Participant " + participant.getName() + " already exists");
        }
        Inscription newInscription = new Inscription(participant, event);
        inscriptions.add(newInscription);
        return newInscription;


    }
    public List<Inscription> getInscriptions() {
        return inscriptions;
    }
    public static void unregister(Participant participant, Event event) {
        inscriptions.removeIf(inscription -> inscription.getParticipant().equals(participant) && inscription.getEvent().equals(event));
    }


}
