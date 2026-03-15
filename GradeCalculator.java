/*
 * Pseudocode:-
 * DECLARE CN : INTEGER
 * DECLARE CD : INTEGER
 * DECLARE PM : INTEGER
 * DECLARE DBMS : INTEGER
 * DECLARE ML : INTEGER
 * READ CN, CD, PM, DBMS, ML
 * DECLARE per : REAL
 * per := (CN+CD+PM+DBMS+ML)/5
 * IF per >= 90 then
 * PRINT "A+"
 * ELSE IF per >= 80 then
 * PRINT "A"
 * ELSE IF per >= 70 then
 * PRINT "B+"
 * ELSE IF per >= 60 then
 * PRINT "B"
 * ELSE IF per >= 50 then
 * PRINT "C"
 * ELSE IF per >= 40 then
 * PRINT "D"
 * ELSE PRINT "F"
 * END IF
 */

import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cn, cd, pm, dbms, ml;       
        System.out.println("Enter marks for 5 subjects:");
        cn = input.nextInt();
        cd = input.nextInt();
        pm = input.nextInt();
        dbms = input.nextInt();
        ml = input.nextInt();
        double per = (cn + cd + pm + dbms + ml) / 5.0;     
        System.out.println("Percentage: " + per + "%");
        if (per >= 90) {
            System.out.println("A+");
        } else if (per >= 80) {
            System.out.println("A");
        } else if (per >= 70) {
            System.out.println("B+");
        } else if (per >= 60) {
            System.out.println("B");
        } else if (per >= 50) {
            System.out.println("C");
        } else if (per >= 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }       
        input.close();
    }
}
