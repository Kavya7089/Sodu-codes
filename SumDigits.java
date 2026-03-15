/*
 * Pseudocode:-
 * DECIARE num: INTEGER
 * DECIARE a: INTEGER
 * DECLARE d: INTEGER
 * SET b:=0
 * READ num
 * WHILE num>0
 * a := num MOD 10
 * b := b+a
 * num := num/10
 * END WHILE
 * PRINT b
 */

import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();        
        int b = 0; 
        int a;            
        while (num > 0) {
            a = num % 10;  
            b = b + a;   
            num = num / 10;
        }       
        System.out.println("The sum of digits is: " + b);
        sc.close();
    }
}
