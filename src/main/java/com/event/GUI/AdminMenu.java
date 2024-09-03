package com.event.GUI;

import com.event.entities.Event;
import com.event.entities.Participant;
import com.event.services.EventService;
import com.event.services.InscriptionService;
import com.event.services.ParticipantService;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class AdminMenu {

    public static void AdminGUI(@NotNull Scanner scanner)throws Exception{
        do{
            int choice;

            System.out.println("====\tCHOOSE YOUR OPTION:\t====");
            Thread.sleep(300);
            System.out.println("\t\t[1] option: Create an Event");
            Thread.sleep(300);
            System.out.println("\t\t[2] option: Update an Event");
            Thread.sleep(300);
            System.out.println("\t\t[3] option: Delete an Event");
            Thread.sleep(300);
            System.out.println("\t\t[4] option: Show Events");
            Thread.sleep(300);
            System.out.println("\t\t[5] option: Search for an Event");
            Thread.sleep(300);
            System.out.println("\t\t[6] option: Exit");
            Thread.sleep(500);
            System.out.println("====\tCLICK 7 FOR MORE OPTIONS:\t====");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("====\tENTER EVENT NAME:\t====");
                    String eventName = scanner.nextLine();
                    System.out.println("====\tENTER EVENT LOCATION:\t====");
                    String eventLocation = scanner.nextLine();
                    System.out.println("====\tENTER EVENT DATE:\t====");
                    String eventDate = scanner.nextLine();
                    Event event = new Event(eventName, eventLocation, eventDate);
                    EventService.addEvent(event);
                    System.out.println("\t\tCREATING!..." + event);
                    break;
                case 2:
                    System.out.println("====\tENTER EVENT ID:\t====");
                    int eventId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("====\tENTER EVENT'S NEW NAME:\t====");
                    String name = scanner.nextLine();
                    System.out.println("====\tENTER EVENT'S NEW LOCATION:\t====");
                    String location = scanner.nextLine();
                    System.out.println("====\tENTER EVENT'S NEW DATE:\t====");
                    String date = scanner.nextLine();
                    EventService.updateEvent(eventId,name,location,date);
                    System.out.println("\t\tupdating...");
                    break;
                case 3:
                    System.out.println("====\tENTER EVENT ID:\t====");
                    int targetedEvent = scanner.nextInt();
                    scanner.nextLine();
                    EventService.deleteEvent(targetedEvent);
                    System.out.println("\t\tdeleting...");
                    break;
                case 4:
                    EventService.showEvents();
                    break;
                case 5:
                    System.out.println("\t\tsearching...");
                    EventService.showEvents();
                    System.out.println("====\tENTER AN ID OF AN EVENT:\t====");
                    int id = scanner.nextInt();
                    Event SearchedEvent = EventService.findEvent(id);
                    System.out.println(SearchedEvent);
                    break;
                case 6:
                    MainGUI.Menu();
                    break;
                case 7:
                    System.out.println("\t\tmore options...");
                    Thread.sleep(1000);
                    ManageParticipantGUI(scanner);
                    break;
                default:
                    System.out.println("====\tINVALID CHOICE\t====");
                    break;
            }

        }while(true);

    }

    public static void ManageParticipantGUI(@NotNull Scanner scanner)throws Exception{
        do{
            int choice =0;
            System.out.println("====\tCHOOSE YOUR OPTION:\t====");
            Thread.sleep(300);
            System.out.println("\t\t[1] option: Add participant");
            Thread.sleep(300);
            System.out.println("\t\t[2] option: Edit participant");
            Thread.sleep(300);
            System.out.println("\t\t[3] option: Delete participant");
            Thread.sleep(300);
            System.out.println("\t\t[4] option: Show participants");
            Thread.sleep(300);
            System.out.println("\t\t[5] option: Show Inscriptions");
            Thread.sleep(300);
            System.out.println("\t\t[6] option: Exit");
            try{
                choice = scanner.nextInt();
                scanner.nextLine();
            }catch(Exception e){
                scanner.nextLine();
            }
            switch(choice){
                case 1:
                    System.out.println("====\tENTER PARTICIPANT'S FULL NAME:\t====");
                    String name = scanner.nextLine();
                    Participant participant = new Participant(name);
                    ParticipantService.addParticipant(participant);
                    System.out.println("\t\tcreating...");
                    break;
                case 2:
                    ParticipantService.showParticipants();
                    System.out.println("====\tENTER PARTICIPANT'S ID:\t====");
                    int participantId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("====\tENTER PARTICIPANT'S NEW FULL NAME:\t====");
                    String newName = scanner.nextLine();
                    ParticipantService.updateParticipant(participantId,newName);
                    System.out.println("\t\tupdating...");
                    break;
                case 3:
                    ParticipantService.showParticipants();
                    System.out.println("====\tENTER PARTICIPANT'S ID:\t====");
                    int id = scanner.nextInt();
                    ParticipantService.deleteParticipant(id);
                    System.out.println("\t\tdeleting...");
                    break;
                case 4:
                    System.out.println("\t\tshowing...");
                    ParticipantService.showParticipants();
                    break;
                case 5:
                    System.out.println("====\tSHOWING EVENTS...:\t====");
                    EventService.showEvents();
                    System.out.println("====\tENTER AN ID OF AN EVENT:\t====");
                    int eventID = scanner.nextInt();
                    Event eventInscriptions = EventService.findEvent(eventID);
                    System.out.println("\t\tShowing ...");
                    InscriptionService.showInscriptions(eventInscriptions);
                    break;
                case 6:
                    MainGUI.Menu();
                default:
                    System.out.println("====\tINVALID CHOICE!\t====");
            }
        }while(true);
    }

}
