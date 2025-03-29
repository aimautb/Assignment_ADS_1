package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the factorial of an integer
 * using a recursive approach.
 *
 * Time complexity: O(n), where n is the input number.
 * The recursive function makes n recursive calls, leading to linear complexity.
 */
public class Task4 {


    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Factorial is defined for non-negative integers only.");
            return;
        }


        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    private int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1); // Recursive call: n! = n * (n-1)!
    }
}
