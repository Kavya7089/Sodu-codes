/*
 * Pseudocode:-
 * DECLATRE i : INTEGER
 * SET i :=10
 * REPEAT PRINT i
 * DECREMENT i
 * UNTIL i>=0
 */

public class Countdown {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i--; 
        } while (i >= 0); 
    }
}
