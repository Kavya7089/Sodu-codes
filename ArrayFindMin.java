/*
 * // Find Minimum in Array
 * Declare a : ARRAY[10] of INTEGER
 * Declare min : INTEGER
 * FOR i := 0 to 9
 *     READ a[i]
 * END FOR
 * Set min := a[0]
 * FOR i := 0 to 9
 *     IF a[i] < min THEN
 *         min := a[i]
 *     END IF
 * END FOR
 * PRINT min
 */

import java.util.Scanner;

public class ArrayFindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int min;
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i <= 9; i++) {
            a[i] = scanner.nextInt();
        }
        
        min = a[0];
        for (int i = 0; i <= 9; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        
        System.out.println("Min element is: " + min);
        scanner.close();
    }
}
