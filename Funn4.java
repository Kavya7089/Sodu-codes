/*
 * // What will be the output of the pseudocode a=4, b=4, c=7
 * Integer funn (Integer a, Integer b, Integer c)
 *   for (each c from 3 to 5)
 *     a = (c + c) ^ b
 *     if ( (a + c) < (c + a) )
 *       b = (a + 11) + c
 *     else
 *       c = b + b
 *       a = 3 + b
 *       Continue
 *     END if
 *   End for
 * Return a + b
 */

public class Funn4 {
    public static int funn(int a, int b, int c) {
        for (c = 3; c <= 5; c++) {
            a = (c + c) ^ b;
            if ((a + c) < (c + a)) { // In math this is always false unless overflow, but checking literally
                b = (a + 11) + c;
            } else {
                c = b + b; // Note: modifying loop counter inside loop
                a = 3 + b;
                continue;
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + funn(4, 4, 7));
    }
}
