/*
 * Pseudocode:-
 * DECLARE x: INTEGER
 * DECLARE y: INTEGER
 * READ x,y
 * IF x>0 AND y>0 THEN
 * PRINT "FIRST"
 * ELSE IF x<0 AND y>0 THEN
 * PRINT "SECOND"
 * ELSE IF x<0 AND y<0 THEN
 * PRINT "THIRD"
 * ELSE IF x>0 AND y<0 THEN
 * PRINT "FOURTH"
 * ELSE 
 * PRINT "ORIGIN"
 * END IF
 */

import java.util.Scanner;
public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;       
        System.out.println("Enter coordinates (x and y):");
        x = input.nextInt();
        y = input.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("FIRST");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("SECOND");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("THIRD");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("FOURTH");
        } 
        else {
            System.out.println("ORIGIN or AXIS");
        }        
        input.close();
    }
}
