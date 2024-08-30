import java.util.Scanner;
public class EventKeeper {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{

            System.out.println("====MAIN MENU====");
            System.out.println("[1]. Option 1: Admin");
            System.out.println("[2]. Option 2: Participant");
            System.out.println("[3]. Option 3: Exit");
            System.out.println("=======================");
            Thread.sleep(100);
            System.out.println("CHOSE YOUR ROLE: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\u001B[2J\u001B[0;0H");                
                    AdminMenu(scanner);
                    
                case 2:
                    System.out.print("\u001B[2J\u001B[0;0H");
                    // Addition(scanner);
                    break;
                case 3:
                    System.out.print("\u001B[2J\u001B[0;0H");
                    System.out.println("Exiting the program. Goodbye!");
                    break;
            
                default:
                    System.out.println("Invalid choice. Please try again.");
                }
                

        }while(choice != 3);
        scanner.close();
        

        
    }


    private static void Admin(Scanner scanner){
        scanner.nextLine();
        System.out.println("====ENTER YOUR NAME: ");
        String name = scanner.nextLine();
        System.out.println("\n====Hello " + name.toUpperCase() + " Welcome to the app");

    }
    private static void Addition(Scanner scanner){
        int num1, num2, sum;
        System.out.println("====ENTER THE FIRST NUMBER");
        num1 = scanner.nextInt();
        System.out.println("====ENTER THE SECOND NUMBER");
        num2 = scanner.nextInt();
        sum = num1+num2;
        System.out.println("====THE SUM OF YOUR NUMBERS IS: "+ sum );
        

    }
    public static int AdminMenu (Scanner scanner) throws InterruptedException{
        
            
            System.out.println("\n\n====ADMIN MENU LOADING");
            Thread.sleep(500);
            System.out.println("[1] Option : Event's crud");
            Thread.sleep(500);
            System.out.println("[2] Option : Participant crud");
            Thread.sleep(500);
            System.out.println("[3] Option : Show events");
            Thread.sleep(500);
            System.out.println("[4] Option : Show inscriptions");
            Thread.sleep(500);
            System.out.println("====CHOOSE AN OPTION:");            
            int choice = scanner.nextInt();
            return choice;
        }

    public static void AddEvent(Scanner  scanner){
        
    }

    

}