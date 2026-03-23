/*
 * // find value
 * a=7, b=4
 * Integer funn (Integer a, Integer b)
 *   Integer c
 *   Set c = a + a + b + b
 *   b = c + c + b + b
 *   a = b - a
 *   return a + b
 */

public class Funn5 {
    public static int funn(int a, int b) {
        int c;
        c = a + a + b + b;
        b = c + c + b + b;
        a = b - a;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Value: " + funn(7, 4));
    }
}
