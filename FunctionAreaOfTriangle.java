/*
 * // Example 3: Area of Triangle
 * FUNCTION aot (base : REAL, height : REAL) : REAL
 *     
 *     RETURN 0.5 * base * height   
 * END FUNCTION
 */

public class FunctionAreaOfTriangle {
    public static double aot(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double result = aot(10.0, 5.0);
        System.out.println("Area of Triangle: " + result);
    }
}
