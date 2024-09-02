package com.event.services;

import com.event.entities.Event;
import com.event.entities.Inscription;
import com.event.entities.Participant;

import java.util.ArrayList;
import java.util.List;

public class InscriptionService {
    private static List<Inscription> inscriptions = new ArrayList<Inscription>();

    public void register(Participant participant, Event event) {
        boolean found = inscriptions.stream().anyMatch(inscription -> inscription.getParticipant().equals(participant));



    }

}
