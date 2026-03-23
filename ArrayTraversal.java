/*
 * PROCEDURE Traversal (ARRAY x[] OF INTEGER, n : INTEGER)
 *   FOR i := 0 TO n-1
 *     PRINT x[i]
 *   END FOR
 * END PROCEDURE
 * 
 * CALL Traversal( DECLARE a : ARRAY[0:4] OF INTEGER, DECLARE n : INTEGER )
 *   SET n := 5
 * CALL Traversal(a[], n)
 */

public class ArrayTraversal {
    public static void traversal(int[] x, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5]; // Initialize with default values (0)
        // Optionally populate array
        for(int i = 0; i < a.length; i++) {
            a[i] = i * 2;
        }
        int n = 5;
        traversal(a, n);
    }
}
