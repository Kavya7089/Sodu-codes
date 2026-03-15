/*
 * // Find max of two
 * PROCEDURE max (a : INTEGER, b : INTEGER)
 *     IF a > b THEN
 *         PRINT a
 *     END IF
 * END PROCEDURE
 */

public class ProcedureMax {
    public static void max(int a, int b) {
        if (a > b) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        max(10, 5);
    }
}
