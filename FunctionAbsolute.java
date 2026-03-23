/*
 * // Example 5
 * FUNCTION absolute (a: REAL) : REAL
 *   DECLARE r : REAL
 *   IF a > 0 THEN
 *     RETURN a
 *   ELSE
 *     RETURN -a
 *   ENDIF
 * END FUNCTION
 * PRINT absolute(-5)
 */

public class FunctionAbsolute {
    public static double absolute(double a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static void main(String[] args) {
        System.out.println(absolute(-5.0));
    }
}
