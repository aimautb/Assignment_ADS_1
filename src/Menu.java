import java.util.Scanner;
import tasks.*;

public class Menu {
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Select task (1-10)");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            if (option == 2) {
                System.out.println("Exiting...");
                break;
            } else if (option == 1) {
                System.out.print("Enter task number (1-10): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> new Task1().run();
                    case 2 -> new Task2().run();
                    case 3 -> new Task3().run();
                    case 4 -> new Task4().run();

                    default -> System.out.println("Invalid task number.");
                }
            } else {
                System.out.println("Invalid option. Please choose 1 or 2.");
            }
        }
    }
}
