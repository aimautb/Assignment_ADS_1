package tasks;
import java.util.Scanner;

/**
 * This class provides a method to calculate the arithmetic mean
 * of a set of numbers provided by the user.
 *
 * Time complexity: O(n), where n is the number of elements.
 */

public class Task2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. The number of elements must be greater than 0.");
            return;
        }

        System.out.println("Enter " + n + " numbers:");
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        double average = sum / n;
        System.out.println("Arithmetic mean: " + average);
    }
}
