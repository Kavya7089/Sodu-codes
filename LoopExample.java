/*
 * Pseudocode:-
 * DECLATRE i : INTEGER
 * SET i :=1
 * DO PRINT i
 * INCREMENT i
 * WHILE i<=10
 */

public class LoopExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i); 
            i++;                   
        } while (i <= 10);      
    }
}
