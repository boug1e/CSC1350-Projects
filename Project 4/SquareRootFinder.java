
package com.mycompany.squarerootfinder;
import java.util.Scanner;
/**
 *This program will find the square root of a number entered by using the squeeze thereom, and listing
 * all values until it reaches the midpoint(square root)<br>
 * @author mason
 * <pre>
 * Date: 3/1/2023
 * Course: csc 1350 Section 1
 * Instructor: Dr. Duncan
 * Lab: 4
 * </pre>
 */
public class SquareRootFinder {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a number to determine its square root -> ");
        double n = cin.nextDouble();
        double low;
        double high;
        double EPSILON = 1E-10;
        if (n < 0) {
            System.out.printf("sqrt(%.2f) = NaN", n);
        }else{    
            System.out.printf("Iterative Interval Approximation of the Square Root of %.10f %n", n);
            System.out.println("======================================================================\n" + 
                    "Approximation          Approximation^2          MAX ERROR\n" + "−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
            if (n <= 1){
                low = 0;
                high = 1;
                System.out.printf("sqrt(%.1f) = %.10f", n, high);

        }else{
            low = 1;
            high = n;
        }
            while (Math.abs(high-low) > EPSILON) {
                double midpoint = (low+high)/2;
                double MAXERROR = high - low;
                System.out.printf("%.10f    %.10f   %.10f %n", midpoint, midpoint*midpoint, MAXERROR);
                if (midpoint*midpoint > n) {
                    high = midpoint;
                }else{
                    low = midpoint;
                }
            
            } System.out.printf("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−%n"+
                    "sqrt(%.1f) = %.10f", n, high);
        }
    }
}



