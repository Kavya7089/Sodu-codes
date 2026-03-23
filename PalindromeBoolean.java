/*
 * // Palindrome Boolean
 * FUNCTION PALINDROME (n: INTEGER) : BOOLEAN
 *   DECLARE a : INTEGER
 *           b : INTEGER
 *           x : INTEGER
 *   SET b := 0
 *   SET x := n
 *   WHILE n > 0 LOOP
 *     a := n MOD 10
 *     n := n / 10
 *     b := b * 10 + a
 *   END WHILE
 *   IF b == x THEN
 *     RETURN TRUE
 *   ELSE
 *     RETURN FALSE
 * END FUNCTION
 * PRINT Palindrome(151)
 */

public class PalindromeBoolean {
    public static boolean palindrome(int n) {
        int a;
        int b = 0;
        int x = n;
        
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            b = b * 10 + a;
        }
        
        if (b == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome(151));
    }
}
