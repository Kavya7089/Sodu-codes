/*
 * // Find Maximum in Array
 * Declare a : ARRAY[5] of INTEGER
 * Declare max : INTEGER
 * FOR i := 0 to 4
 *     READ a[i]
 * END FOR
 * Set max := a[0]
 * FOR i := 0 to 4
 *     IF a[i] > max THEN
 *         max := a[i]
 *     END IF
 * END FOR
 * PRINT max
 */

import java.util.Scanner;

public class ArrayFindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int max;
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i <= 4; i++) {
            a[i] = scanner.nextInt();
        }
        
        max = a[0];
        for (int i = 0; i <= 4; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.println("Max element is: " + max);
        scanner.close();
    }
}
