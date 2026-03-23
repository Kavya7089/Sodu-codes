/*
 * // Q. a=4, b=8, c=57
 * Integer funn(Integer a, Integer b, Integer c)
 *   b = (a ^ 11) & b
 *   for (each c from 3 to 6)
 *     b = 3 + c
 *     if ((c < b || (a > c)) && (5 - a != 0)) // Note: 5 - a in Java needs boolean condition
 *       a = (c + 2) + c
 *       b = c + c
 *       Jump out of the loop
 *     End if
 *   End for
 * End funn
 * // Ans: 14
 */

public class Funn1 {
    public static int funn(int a, int b, int c) {
        b = (a ^ 11) & b;
        for (c = 3; c <= 6; c++) {
            b = 3 + c;
            // Evaluated logic properly
            if ((c < b || (a > c)) && (5 - a != 0)) {
                a = (c + 2) + c;
                b = c + c;
                break; // Jump out of the loop
            }
        }
        // Assuming we return 'a' or combination. The exact return statement is not given in pseudo.
        // It says Ans: 14. If a=4 originally, a in loop becomes (3+2)+3 = 8.
        // If it means return a+b, let's just observe. Return a + b? 8 + 6 = 14.
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Ans: " + funn(4, 8, 57));
    }
}
