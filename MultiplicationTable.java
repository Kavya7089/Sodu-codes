/*
 * Pseudocode:-
 * DECLARE i : INTEGER
 * DECLARE num : INTEGER
 * SET i := 1
 * READ num
 * WHILE i<=10
 * PRINT num*i
 * INCREMENT i
 * END WHILE
 */

import java.util.Scanner; 
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;    
        int num;             
        System.out.print("Enter a number: ");
        num = scanner.nextInt(); 
        while (i <= 10) {
            System.out.println(num * i); 
            i++;                         
        }        
        scanner.close(); 
    }
}
