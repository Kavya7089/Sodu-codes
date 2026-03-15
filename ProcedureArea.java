/*
 * // Example 3: Area
 * PROCEDURE area_of_c (h : INTEGER, b : INTEGER)
 *     PRINT 0.5 * h * b
 * END PROCEDURE
 * CALL area(4, 5)
 */

public class ProcedureArea {
    public static void area_of_c(int h, int b) {
        System.out.println(0.5 * h * b);
    }

    public static void main(String[] args) {
        area_of_c(4, 5); // Corrected the method call from area to area_of_c
    }
}
