import java.util.Scanner;
public class EventKeeper {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{

            System.out.println("====MAIN MENU====");
            System.out.println("[1]. Option 1: Greet");
            System.out.println("[2]. Option 2: Perform Addition");
            System.out.println("[3]. Option 3: Exit");
            System.out.println("=======================");
            Thread.sleep(100);
            System.out.println("ENTER YOUR CHOICE: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                System.out.print("\u001B[2J\u001B[0;0H");
                Greet(scanner);
                break;
                case 2:
                System.out.print("\u001B[2J\u001B[0;0H");
                Addition(scanner);
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

    private static void Greet(Scanner scanner){
        scanner.nextLine();
        System.out.println("\n\n====ENTER YOUR NAME: ");
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

}