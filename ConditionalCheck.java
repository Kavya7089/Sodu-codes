/*
 * Pseudocode:-
 * DECLARE X : INTEGER
 * READ X
 * IF X>=5 THEN
 * PRINT " X is greater than or equal to 5"
 * END IF
 */

import java.util.Scanner;
public class ConditionalCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for X: ");
        if (input.hasNextInt()) {
            int x = input.nextInt();
            if (x >= 5) {
                System.out.println("X is greater than or equal to 5");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }
        input.close();
    }
}
