/*
 * // Q. a=3, b=8, c=7
 * Integer funn(Integer a, Integer b, Integer c)
 *   if ((a ^ 8) < 8)
 *     c = a + c
 *     c = a + c
 *   End if
 *   return a + b + c
 * // Ans: 18
 */

public class Funn3 {
    public static int funn(int a, int b, int c) {
        if ((a ^ 8) < 8) {
            c = a + c;
            c = a + c;
        }
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Ans: " + funn(3, 8, 7));
    }
}
