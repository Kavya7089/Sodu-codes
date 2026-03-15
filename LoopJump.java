/*
 * Pseudocode:-
 * INTEGER x,y
 * FOR (EACH x FROM 1 TO 11)
 * x = x+2
 * END FOR
 * PRINT x
 */

public class LoopJump {
    public static void main(String[] args) {
        int x;
        for (x = 1; x <= 11; x++) {
            x = x + 2; // Manual jump
        }
        System.out.println(x); 
    }
}
