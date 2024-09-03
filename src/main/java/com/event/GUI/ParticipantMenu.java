package com.event.GUI;

import com.event.entities.Event;
import com.event.entities.Inscription;
import com.event.entities.Participant;
import com.event.services.EventService;
import com.event.services.InscriptionService;
import com.event.services.ParticipantService;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;




public class ParticipantMenu {
    public static void ParticipantGUI(@NotNull Scanner scanner)throws Exception{
        do{
            int choice;
            System.out.println("====\tCHOOSE YOUR OPTION:\t====");
            Thread.sleep(300);
            System.out.println("\t\t[1] option: Register for an Event");
            Thread.sleep(300);
            System.out.println("\t\t[2] option: Unsubscribe from an Event");
            Thread.sleep(300);
            System.out.println("\t\t[3] option: Show Events");
            Thread.sleep(300);
            System.out.println("\t\t[4] option: Show Registered Events");
            Thread.sleep(300);
            System.out.println("\t\t[5] option: Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\t====ENTER YOUR FULL NAME====\t");
                    String fullName = scanner.nextLine();
                    Participant participant = ParticipantService.validateParticipant(fullName);
                    if(participant != null){
                        System.out.println("\t====WELCOME DEAR PARTICIPANT");
                        Thread.sleep(500);
                        System.out.println("\t====SHOWING AVAILABLE EVENTS...!====\t");
                        Thread.sleep(300);
                        EventService.showEvents();
                        System.out.println("\t====CHOOSE DESIRED EVENT:====\t");
                        int id = scanner.nextInt();
                        Event event = EventService.findEvent(id);
                        System.out.println(event +"" + participant);
                        Inscription inscription =InscriptionService.register(participant, event);


                    }else{
                        System.out.println("\t====PARTICIPANT NOT REGISTERED!====");
                    }

                    break;
                case 2:
                    //unsubscribe
                    System.out.println("\t====ENTER YOUR FULL NAME====\t");
                    String FullName = scanner.nextLine();
                    Participant Target_prtcpnt = ParticipantService.findParticipantByName(FullName);
                    if(Target_prtcpnt != null){
                        InscriptionService.showInscriptions(Target_prtcpnt);
                        InscriptionService.unregister(Target_prtcpnt);
                    }else{
                        System.out.println("\t====PARTICIPANT NOT REGISTERED!====");
                    }


                    break;
                case 3:
                    EventService.showEvents();
                    break;
                case 4:
                    System.out.println("\t====ENTER YOUR FULL NAME====\t");
                    String member = scanner.nextLine();
                    Participant Participant = ParticipantService.findParticipantByName(member);
                    if(Participant != null){
                        InscriptionService.showInscriptions(Participant);
                    }else{
                        System.out.println("====\tPARTICIPANT NOT REGISTERED TO ANY EVENT!\t====");
                    }
                    break;
                case 5:
                    MainGUI.Menu();
                default:
                    System.out.println("====\tINVALID CHOICE!\t====");
            }


        }while(true);

    }


}
