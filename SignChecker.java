/*
 * Pseudocode:-
 * DECLARE num : INTEGER
 * READ num
 * IF num >=0 then
 * PRINT "POSITIVE"
 * ELSE
 * PRINT "NEGATIVE"
 * END IF
 */

import java.util.Scanner;
public class SignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) {
            int num = input.nextInt();
            if (num >= 0) {
                System.out.println("POSITIVE");
            } 
            else {
                System.out.println("NEGATIVE");
            }
        } else {
            System.out.println("Error: Please enter a valid whole number.");
        }       
        input.close();
    }
}
