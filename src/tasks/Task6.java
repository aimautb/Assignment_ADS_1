package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the power of a number
 * using recursion.
 *
 * Time complexity: O(n), where n is the exponent.
 * The function makes n recursive calls, reducing n by 1 each time.
 */


public class Task6 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. This program supports only non-negative exponents.");
            return;
        }

        System.out.println(a + " raised to the power of " + n + " is " + power(a, n));
    }

    private int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}
