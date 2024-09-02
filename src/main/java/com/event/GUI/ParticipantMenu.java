package com.event.GUI;

import com.event.entities.Participant;
import com.event.services.EventService;
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
                    if(ParticipantService.validateParticipant(fullName)){
                        System.out.println("\t====WELCOME DEAR PARTICIPANT");
                        Thread.sleep(500);
                        System.out.println("\t====SHOWING AVAILABLE EVENTS...!====\t");
                        Thread.sleep(300);
                        EventService.showEvents();

                    }else{
                        System.out.println("\t====PARTICIPANT NOT REGISTERED!====");
                    }

                    break;
                case 2:
                    //unsubscribe
                    break;
                case 3:
                    EventService.showEvents();
                    break;
                case 4:
                    //show subscriptions
                    break;
                case 5:
                    scanner.close();
                    MainGUI.Menu();

            }


        }while(true);

    }


}
