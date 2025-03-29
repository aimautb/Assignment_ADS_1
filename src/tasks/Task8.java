package tasks;
import java.util.Scanner;

/**
 * This class provides a recursive method to check whether a given string
 * consists only of digits.
 *
 * Time complexity: O(n), where n is the length of the string.
 * The function checks each character once, making n recursive calls.
 */

public class Task8 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.next();

        System.out.println("The string " + (isDigits(s, 0) ? "contains only digits." : "contains non-digit characters."));
    }

    private boolean isDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isDigits(s, index + 1);
    }
}
