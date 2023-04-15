
package com.mycompany.trianglesolver;
import java.util.*;

/**
 *This program calculates the perimeter, area, and centroid of triangle 
 * based on 3 coordinate points entered by the user. 
 * @author Mason Bourgeois
 * <pre>
 * Date: 2/8/2023
 * Course: CSC 1350 Section: 1 
 * Lab: 1 <br>
 * Instructor: Dr. Duncan <br>
 * </pre>
 */

public class TriangleSolver {
    
    public static void main(String[] args) {
        Scanner point = new Scanner(System.in);
        System.out.print("Enter the x-coordinate and y-coordinate of the first"
                + " vertex -> ");
        double point1X = point.nextDouble(), point1Y = point.nextDouble();
        System.out.print("Enter the x-coordinate and y-coordinate of the second"
                + " vertex -> ");
        double point2X = point.nextDouble(), point2Y = point.nextDouble();
        System.out.print("Enter the x-coordinate and y-coordinate of the third"
                + " vertex -> ");
        double point3X = point.nextDouble(), point3Y = point.nextDouble();
        System.out.printf("Triangle: p1 = (%.3f, %.3f); p2 (%.3f, %.3f); p3 = (%.3f, %.3f)%n" 
                ,point1X, point1Y, point2X, point2Y, point3X, point3Y); 
        
        double lengthAB = Math.sqrt((Math.pow(point2X - point1X,2))+
                (Math.pow(point2Y - point1Y,2)));
        double lengthAC = Math.sqrt((Math.pow(point3X - point1X,2))+
                (Math.pow(point3Y - point1Y,2)));
        double lengthBC = Math.sqrt((Math.pow(point3X - point2X,2))+
                (Math.pow(point3Y - point2Y,2)));
        System.out.printf("Side A = %.6f; side B = %.3f; side C = %.3f %n" 
                ,lengthAB, lengthAC, lengthBC);
        
        double perimeter = ((Math.abs(lengthAB))+(Math.abs(lengthAC))+(Math.abs(lengthBC)));
        System.out.printf("Perimeter = %.3f %n", perimeter);
        
        double semiperimeter = perimeter/2;
        double area = Math.sqrt(semiperimeter*(semiperimeter-Math.abs(lengthAB))*
                (semiperimeter-Math.abs(lengthAC))*(semiperimeter-Math.abs(lengthBC)));
        System.out.printf("Area = %.3f %n", area);
        
        double centroidX = (point1X+point2X+point3X) / 3, centroidY = (point1Y+
                point2Y+point3Y) / 3;
        System.out.printf("Centroid = (%.3f, %.3f)", centroidX, centroidY);
    }
}
