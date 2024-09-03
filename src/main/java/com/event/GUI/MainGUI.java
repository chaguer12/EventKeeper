package com.event.GUI;
import java.util.Scanner;

public class MainGUI {
    public static Scanner scanner = new Scanner(System.in);

    public static void Menu()throws Exception {
        do{
            String password = "P@$$w0rd";
            int choice = 0;
            System.out.println("====\tWELCOME TO EVENT_KEEPER!\t====");
            Thread.sleep(500);
            System.out.println("====\tCHOOSE YOUR OPTION:\t====");
            Thread.sleep(300);
            System.out.println("\t\t[1] option: Admin");
            Thread.sleep(300);
            System.out.println("\t\t[2] option: Participant");
            Thread.sleep(300);
            System.out.println("\t\t[3] option: Exit");
            try{
                choice = scanner.nextInt();
                scanner.nextLine();
            }catch(Exception e){
                scanner.nextLine();
            }
            switch (choice) {
                case 1:
                    System.out.println("====\tENTER ADMIN PASSWORD:\t====");
                    String EnteredPass = scanner.nextLine();
                    if(EnteredPass.equals(password)) {
                        System.out.println("Access granted. You are an administrator.");
                        AdminMenu.AdminGUI(scanner);
                    }else {
                        System.out.println("Incorrect password. Access denied.");
                    }

                    break;
                case 2:
                    System.out.println("you are a participant");
                    ParticipantMenu.ParticipantGUI(scanner);
                    break;
                case 3:
                    System.out.println("====\tBYE BYE !\t====");
                    System.exit(0);
                    return;
                default:
                    System.out.println("====\tINVALID CHOICE\t====");
            }

        }while(true);
    }
}
