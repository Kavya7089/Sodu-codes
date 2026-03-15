/*
 * // Example:
 * Declare a : ARRAY[0:4] of INTEGER
 * FOR i := 0 to 4
 *     READ a[i]
 * END FOR
 * 
 * FOR i := 0 to 4
 *     PRINT a[i]
 * END FOR
 */

import java.util.Scanner;

public class ArrayBasicPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i <= 4; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.println("Array elements are:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
        
        scanner.close();
    }
}
