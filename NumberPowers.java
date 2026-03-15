/*
 * Pseudocode:-
 * DECLARE num=INTEGER
 * READ num
 * PRINT num*num
 * PRINT num*num*num
 */

import java.util.Scanner;
public class NumberPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.println("Square: " + (num * num));
            System.out.println("Cube: " + (num * num * num));
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }
        input.close();
    }
}
