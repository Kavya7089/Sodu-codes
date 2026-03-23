/*
 * // Example 4
 * FUNCTION max (a: INTEGER, b: INTEGER) : INTEGER
 *   DECLARE c : INTEGER
 *   IF a > b THEN
 *     c := a
 *   ELSE
 *     c := b
 *   ENDIF
 *   RETURN c
 * END FUNCTION
 * PRINT max(23, 6)
 */

public class FunctionMaxTwo {
    public static int max(int a, int b) {
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(max(23, 6));
    }
}
