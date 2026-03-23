/*
 * // Q. What will be value of even counter if number = 2630
 * Read number
 * Function divisible (number)
 *   even_counter = 0, num_remainder = number;
 *   while (num_remainder != 0)
 *     digit = num_remainder % 10;
 *     if (digit != 0 AND number % digit == 0)
 *       even_counter = even_counter + 1
 *     End if
 *     num_remainder = num_remainder / 10;
 *   End while
 *   Return even_counter;
 * // Ans: 2
 */

import java.util.Scanner;

public class DivisibleCounter {
    public static int divisible(int number) {
        int even_counter = 0;
        int num_remainder = number;
        
        while (num_remainder != 0) {
            int digit = num_remainder % 10;
            if (digit != 0 && number % digit == 0) {
                even_counter = even_counter + 1;
            }
            num_remainder = num_remainder / 10;
        }
        return even_counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (e.g., 2630): ");
        int number = scanner.nextInt();
        int result = divisible(number);
        System.out.println("even_counter value: " + result);
        scanner.close();
    }
}
