/*
 * Pseudocode:-
 * INTEGER i, num, fact
 * READ Num
 * SET fact:=1
 * WHILE i>0
 * Fact: = fact* i
 * DECREMENT i
 * END WHILE
 * PRINT Fact
 */

import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();       
        long fact = 1; 
        int i = num;  
        while (i > 0) {
            fact = fact * i; 
            i--;             
        }       
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
