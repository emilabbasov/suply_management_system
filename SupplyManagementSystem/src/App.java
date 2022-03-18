import java.util.Scanner;

public class App {
    private static boolean registered = false;
    private static boolean loggedIn = false;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (registered == false) {
                System.out.println("Menu:");
                System.out.println("1. Register");
                System.out.print("What do you want to do?:");
                int selected = sc.nextInt();
                if (selected == 1) {
                    sc.nextLine();
                    System.out.print("Enter your name:");
                    String name = sc.nextLine();

                    System.out.print("Enter your surname:");
                    String surname = sc.nextLine();

                    System.out.print("Enter your email:");
                    String email = sc.nextLine();

                    registered = true;
                    System.out.println("You registered!!!");
                }
            } else if (loggedIn == false && registered == true) {
                System.out.println("Please LogIn!!!");
                System.out.println("--------------------------");
                System.out.print("Enter your name:");
                String name = sc.nextLine();

                System.out.print("Enter your email:");
                String email = sc.nextLine();

                loggedIn = true;
                while (true) {

                    System.out.println("Menu:");
                    System.out.println("1. Order Food"
                            + "\n2. Order Drink"
                            + "\n3. Log Out");
                    System.out.print("What do you want to do?:");
                    int selected = sc.nextInt();
                    if (selected == 1) {
                        sc.nextLine();
                        System.out.print("How many food do you want to order:");
                        int count = sc.nextInt();
                        int i = 0;

                        while (i < count) {
                            i++;
                            sc.nextLine();
                            System.out.print("Enter food's name:");
                            String foodName = sc.nextLine();

                            System.out.println("Food is ordered");
                        }
                    } else if (selected == 2) {
                        sc.nextLine();
                        System.out.print("How many drink do you want to order:");
                        int countOfDrinks = sc.nextInt();
                        int y = 0;

                        while (y < countOfDrinks) {
                            y++;
                            sc.nextLine();
                            System.out.print("Enter drink's name:");
                            String drinkName = sc.nextLine();

                            System.out.println("Drink is ordered");
                        }
                    } else if (selected == 3) {
                        System.out.println("You just logged out!!!");
                        break;
                    }
                }
            }
        }
    }
}
