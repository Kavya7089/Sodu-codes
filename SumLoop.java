/*
 * Pseudocode:-
 * DECLARE num : INTEGER
 * DECLARE sum : INTEGER
 * SET sum :=0
 * READ num
 * FOR i=1 TO num
 * SUM:=SUM+1
 * END FOR
 * PRINT SUM
 */

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        int num;
        int sum = 0; 
        System.out.print("Enter a number: ");
        num = scanner.nextInt(); 
        for (int i = 1; i <= num; i++) {
            sum = sum + 1; 
        }       
        System.out.println(sum); 
        scanner.close();
    }
}
