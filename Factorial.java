/*
 * Pseudocode:-
 * INTEGER i, num, fact
 * READ num
 * SET fact :=1
 * FOR i:=num TO STEP-1
 * FACT :=fact*i
 * END FOR
 * PRINT fact
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, fact = 1; 
        System.out.print("Enter a number: ");
        num = scanner.nextInt(); 
        for (int i = num; i >= 1; i--) {
            fact = fact * i; 
        }        
        System.out.println("Factorial is: " + fact);
        scanner.close();
    }
}
