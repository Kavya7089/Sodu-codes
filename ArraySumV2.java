/*
 * // (OR) Alternative Sum Logic
 * Declare a : ARRAY[5] of INTEGER
 * Declare sum : INTEGER
 * Set sum := 0
 * FOR i := 0 to 4
 *     READ a[i]
 * END FOR
 * FOR i := 0 to 4
 *     sum := sum + a[i]
 * END FOR
 * PRINT sum
 */

import java.util.Scanner;

public class ArraySumV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i <= 4; i++) {
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i <= 4; i++) {
            sum = sum + a[i];
        }
        
        System.out.println("Sum of array elements: " + sum);
        scanner.close();
    }
}
