package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the nth Fibonacci number
 * using a recursive approach.
 *
 * Time complexity: O(2^n), where n is the input number.
 * The recursive function makes two recursive calls for each step,
 * leading to exponential growth in execution time.
 */

public class Task5 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer (n): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Fibonacci sequence is defined for non-negative integers only.");
            return;
        }

        System.out.println("The " + n + "-th Fibonacci number is " + fibonacci(n));
    }

    private int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
