package tasks;
import java.util.Scanner;

/**
 * This class calculates the binomial coefficient C(n, k),
 * which represents the number of ways to choose k elements from n.
 *
 * Uses recursion based on Pascal's rule:
 * C(n, k) = C(n-1, k-1) + C(n-1, k)
 *
 * Time Complexity: O(2^n) (exponential growth due to recursion).
 */


public class Task9 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n (total elements): ");
        int n = scanner.nextInt();

        System.out.print("Enter k (chosen elements): ");
        int k = scanner.nextInt();

        if (n < 0 || k < 0 || k > n) {
            System.out.println("Invalid input. Ensure that 0 ≤ k ≤ n.");
            return;
        }

        System.out.println("Binomial coefficient C(" + n + ", " + k + ") = " + binomial(n, k));
    }

    private int binomial(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
}
