/*
 * Pseudocode:-
 * DECLARE radius : REAL
 * DECLARE area : REAL
 * DECLARE circum : REAL
 * CONSTANT PI = 3.14
 * READ radius
 * area:=PI*radius*radius
 * circum:=2*PI*radius
 * PRINT area
 * PRINT circum
 */

import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14; 
        double radius, area, circum;
        System.out.print("Enter the radius: ");
        if (input.hasNextDouble()) {
            radius = input.nextDouble();
            area = PI * radius * radius;
            circum = 2 * PI * radius;
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circum);
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
        input.close();
    }
}
