package com.event.GUI;

import com.event.entities.Event;
import com.event.services.EventService;
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
                    System.out.println("\t\tupdating...");
                    break;
                case 3:
                    System.out.println("\t\tdeleting...");
                    break;
                    case 4:
                        EventService.showEvents();
                        break;
                case 5:
                    System.out.println("\t\tsearching...");
                    break;
                case 6:
                    scanner.close();
                    MainGUI.Menu();
                    break;
                case 7:
                    System.out.println("\t\tmore options...");
                    break;
                default:
                    System.out.println("====\tINVALID CHOICE\t====");
                    break;
            }

        }while(true);

    }
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
            System.out.println("\t\t[6] option: Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

        }while(true);

    }

    public static void ManageParticipantGUI(@NotNull Scanner scanner)throws Exception{
        do{
            int choice;
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
            System.out.println("\t\t[5] option: Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("\t\tcreating...");
                    break;
                case 2:
                    System.out.println("\t\tupdating...");
                    break;
                case 3:
                    System.out.println("\t\tdeleting...");
                    break;
                case 4:
                    System.out.println("\t\tshowing...");
                    break;
                case 5:
                    MainGUI.Menu();
            }
        }while(true);
    }

}
