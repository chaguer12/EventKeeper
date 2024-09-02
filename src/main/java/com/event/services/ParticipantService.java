package com.event.services;

import com.event.entities.Participant;

import java.util.ArrayList;
import java.util.List;

public class ParticipantService {
    private static List<Participant> participants = new ArrayList<>();

    public static void addParticipant(Participant participant) {
        participants.add(participant);
        System.out.println("Participant added: " + participant);

    }

    public static List<Participant> getParticipants() {
        return participants;
    }

    public static void showParticipants() {
        if(participants.isEmpty()) {
            System.out.println("====\tNO PARTICIPANTS FOUND\t====");
        }else{
            for(Participant participant : participants){
                System.out.println(participant);
            }
        }
    }

    private static Participant findParticipant(int id){
        for(Participant participant : participants){
            if(participant.getId() == id){
                return participant;
            }
        }
        return null;
    }
    public static boolean updateParticipant(int id,String newName) {
        Participant participant = findParticipant(id);
        if(participant != null){
            participant.setName(newName);
            System.out.println("====\tPARTICIPANT UPDATED");
            return true;
        }else {
            System.out.println("====\tNO PARTICIPANTS FOUND");
            return false;
        }
    }

    public static boolean deleteParticipant(int id){
        Participant participant = findParticipant(id);
        if(participant != null){
            participants.remove(participant);
            System.out.println("====\tPARTICIPANT DELETED");
            return true;
        }else {
            System.out.println("====\tNO PARTICIPANTS FOUND");
            return false;
        }
    }
}
