package tasks;
import java.util.Scanner;

/**
 * This class provides a method to determine whether a given number
 * is prime or composite using a recursive approach.
 *
 * Time complexity: O(n sqrt), where n is the input number.
 * The recursive function only checks divisibility up to n sqrt,
 * reducing unnecessary computations.
 */
public class Task3 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. Enter a non-negative number.");
            return;
        }

        System.out.println(n + " is " + (isPrime(n, 2) ? "a prime number." : "a composite number."));
    }

    private boolean isPrime(int n, int d) {
        if (n < 2) return false;
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrime(n, d + 1);
    }
}
