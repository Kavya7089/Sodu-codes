/*
 * Pseudocode:-
 * DECLARE num : INTEGER
 * READ num
 * IF num MOD 2==0 Then
 * PRINT"EVEN"
 * ELSE
 * PRINT"ODD"
 * END IF
 */

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.print("Enter a number: ");
        if (input.hasNextInt()) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("EVEN");
            } 
            else {
                System.out.println("ODD");
            }
        } else {
            System.out.println("Error: Please enter a whole number.");
        }
        input.close();
    }
}
