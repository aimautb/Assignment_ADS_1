package tasks;
import java.util.Scanner;

/**
 * This class provides a method to read a sequence of numbers
 * and print them in reverse order using recursion.
 *
 * Time complexity: O(n), where n is the number of elements.
 * The function makes n recursive calls, storing each number and printing them in reverse.
 */

public class Task7 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. The number of elements must be greater than 0.");
            return;
        }

        System.out.println("Enter " + n + " numbers:");
        reverse(n, scanner);
        System.out.println();
    }

    private void reverse(int n, Scanner scanner) {
        if (n == 0) return;
        int num = scanner.nextInt();
        reverse(n - 1, scanner);
        System.out.print(num + " ");
    }
}
