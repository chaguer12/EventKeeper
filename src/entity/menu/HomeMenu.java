public class HomeMenu {

    public HomeMenu(){
        do {
            System.out.println("=====WELCOME TO EVENTKEEPER=====");
            Thread.sleep(500);
            System.out.println("=====PLEASE CHOOSE YOUR OPTION=====");
            Thread.sleep(500);
            System.out.println("1. Administrator");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = new java.util.Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    System.out.println("=====ADMINISTRATOR=====");
                    break;
                case 2:
                    System.out.println("=====USER=====");
                    break;
                case 3:
                    System.out.println("=====THANK YOU=====");
                    break;
                default:
                    System.out.println("=====INVALID CHOICE=====");
                    break;
            }

        } while (condition);
    }
    
}
