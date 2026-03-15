/*
 * Pseudocode:-
 * DECLARE n, i : INTEGER
 * DECLARE sum : REAL
 * SET sum := 0
 * OUTPUT "Enter the value of n:"
 * INPUT n
 * FOR i FROM 1 TO n
 * SET sum := sum + (1 / i)
 * NEXT i
 * OUTPUT "The harmonic sum is: ", sum
 */

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();        
        double sum = 0.0; 
        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println("The sum of the series is: " + sum);
        scanner.close();
    }
}
