/*
 * // Q. What will be the output for a=2, b=6, c=1
 * Integer funn(Integer a, Integer b, Integer c)
 *   if ((c ^ b + a) < (a & c))
 *     b = a ^ b
 *     c = (a + 3) + c
 *   End if
 *   if ((3 ^ b) + (c ^ c) > (11 & c))
 *     b = (c + (2) ^ a)
 *   End if
 *   return a + b + c
 * // Ans: 18
 */

public class Funn2 {
    public static int funn(int a, int b, int c) {
        if ((c ^ (b + a)) < (a & c)) {
            b = a ^ b;
            c = (a + 3) + c;
        }
        if (((3 ^ b) + (c ^ c)) > (11 & c)) {
            b = (c + (2 ^ a)); // Notice the parenthesis matching
        }
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Ans: " + funn(2, 6, 1));
    }
}
