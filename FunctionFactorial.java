/*
 * // Factorial
 * FUNCTION factorial(n: INTEGER)
 *   DECLARE fact : INTEGER
 *   SET fact := 1
 *   FOR i in n to 1
 *     fact := fact * i
 *   END FOR
 *   RETURN fact
 * END FUNCTION
 * PRINT factorial(5)
 */

public class FunctionFactorial {
    public static int factorial(int n) {
        int fact = 1;
        // In Java, loop runs descending from n to 1
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
