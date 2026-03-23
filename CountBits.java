/*
 * // Q. What's output n=42
 * Integer CountBits(Integer n)
 *   Integer count = 0
 *   while (n > 0)
 *     count = count + (n mod 2)
 *     n = n / 2
 *   End while
 *   return count
 * End function
 */

public class CountBits {
    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count = count + (n % 2);
            n = n / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 42;
        int result = countBits(n);
        System.out.println("Output for n=" + n + " is: " + result);
    }
}
