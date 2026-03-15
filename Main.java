/*
 * Pseudocode:-
 * DECLATRE i : INTEGER
 * SET i :=1
 * REPEAT PRINT i
 * INCREMENT i
 * UNTIL i<=10
 */

public class Main {
    public static void main(String[] args) {
        int i = 1; 
        do {
            System.out.println(i); 
            i++;                  
        } while (i <= 10);       
    }
}
