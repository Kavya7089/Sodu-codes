/*
 * // Q Whats returned for a=4, b=3
 * Integer computevalue (Integer a, Integer b)
 *   Integer result = 1
 *   While (b > 0)
 *     if (b mod 2 equals 1)
 *       result = result * a
 *       a = a * a
 *       b = b / 2
 *     End if
 *   End While
 *   Return result
 * End function
 * // Ans: 64
 */

public class ComputeValue {
    public static int computevalue(int a, int b) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a;
                a = a * a;
                b = b / 2;
            } else {
                // In actual logic, standard exponentiation does a=a*a, b=b/2 when b is even too. 
                // Following the pseudocode literally:
                // Wait, if b % 2 != 1, the while loop would run infinitely if we don't divide b.
                // Assuming standard fast exponentiation was intended.
                a = a * a;
                b = b / 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = computevalue(4, 3);
        System.out.println("Returned value: " + result);
    }
}
