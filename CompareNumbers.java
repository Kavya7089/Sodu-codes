/*
 * Pseudocode:-
 * DECLARE num1 : INTEGER
 * DECLARE num2 : INTEGER
 * READ num1,num2
 * IF num1>num2 then
 * PRINT "num1 is greater"
 * ELSE
 * PRINT "num2 is greater"
 * END IF
 */

import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;       
        System.out.print("Enter first number: ");
        num1 = input.nextInt();     
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("num1 is greater");
        } 
        else {
            System.out.println("num2 is greater");
        }    
        input.close();
    }
}
