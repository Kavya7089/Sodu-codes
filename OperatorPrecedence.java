/*
 * Pseudocode:-
 * DECLARE x, y, z, a AS INTEGER
 *     INITIALIZE x := 9, y := 2, z := 6
 *     a := x AND (y / z)
 *     PRINT a
 * END
 */

public class OperatorPrecedence {
    public static void main(String[] args) {
        int x = 9;
        int y = 2;
        int z = 6;
        int a;
        a = x & y / z;
        System.out.println("The value of a is: " + a);
    }
}
