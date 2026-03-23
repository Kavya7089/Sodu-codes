/*
 * // called with a=9, b=7, c=20
 * Integer funn (Integer a, Integer b, Integer c)
 *   if ((a + c) < (b - a))
 *     c = 4 + b
 *     b = (c + c) + b
 *   ELSE
 *     c = (a + 3) * a
 *     c = (10 & 8) + b
 *   End if
 *   return a + b + c
 * End funn
 */

public class Funn6 {
    public static int funn(int a, int b, int c) {
        if ((a + c) < (b - a)) {
            c = 4 + b;
            b = (c + c) + b;
        } else {
            c = (a + 3) * a;
            c = (10 & 8) + b;
        }
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Ans: " + funn(9, 7, 20));
    }
}
