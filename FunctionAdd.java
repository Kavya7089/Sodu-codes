/*
 * // Example 1: Add
 * FUNCTION add (a : INTEGER, b : INTEGER) : INTEGER
 *     RETURN a + b
 * END FUNCTION
 * PRINT add(2, 3)
 */

public class FunctionAdd {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }
}
