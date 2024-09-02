package com.event.GUI;

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
            System.out.println("\t\t[6] option: Exit");
            choice = scanner.nextInt();
            scanner.nextLine();


        }while(true);

    }


}
