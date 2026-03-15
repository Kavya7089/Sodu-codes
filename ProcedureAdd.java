/*
 * // Example 1: Add numbers
 * PROCEDURE add (a : INTEGER, b : INTEGER)
 *     PRINT a + b
 * END PROCEDURE
 * CALL add(12, 3)
 */

public class ProcedureAdd {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(12, 3);
    }
}
