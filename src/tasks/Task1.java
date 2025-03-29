package tasks;
import java.util.Scanner;

/**
 * This class provides a method to find the minimum number from user input.
 * It reads a series of numbers and determines the smallest value.
 *
 *
 * Time complexity: O(n), where n is the number of elements.
*/
public class Task1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. The number of elements must be greater than 0.");
            return;
        }

        System.out.println("Enter " + n + " numbers:");
        int min = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum number: " + min);
    }
}
