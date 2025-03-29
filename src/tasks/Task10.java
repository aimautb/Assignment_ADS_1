package tasks;
import java.util.Scanner;

/**
 * This class calculates the Greatest Common Divisor (GCD) of two integers
 * using the Euclidean algorithm (recursively).
 *
 * Time Complexity: O(log(min(a, b))), since the algorithm reduces the problem
 * size significantly in each step.
 */

public class Task10 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }

    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}
