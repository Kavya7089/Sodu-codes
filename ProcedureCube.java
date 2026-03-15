/*
 * // Example 2: Cube
 * PROCEDURE cube (n : INTEGER)
 *     PRINT n * n * n
 * END PROCEDURE
 * CALL cube(7)
 */

public class ProcedureCube {
    public static void cube(int n) {
        System.out.println(n * n * n);
    }

    public static void main(String[] args) {
        cube(7);
    }
}
