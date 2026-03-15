/*
 * // Example: Sum of Array Elements
 * // a[0] = 10, a[1] = 20, a[2] = 30, a[3] = 40
 * Declare a : ARRAY[0:4] of INTEGER
 * Declare b : INTEGER
 * Set b = 0
 * FOR i := 0 to 4
 *     READ a[i]
 *     b = b + a[i]
 * END FOR
 * PRINT b
 */

import java.util.Scanner;

public class ArraySumV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int b = 0;
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i <= 4; i++) {
            a[i] = scanner.nextInt();
            b = b + a[i];
        }
        
        System.out.println("Sum of array elements: " + b);
        scanner.close();
    }
}
