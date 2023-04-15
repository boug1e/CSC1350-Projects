

package com.mycompany.outputdemo; 

/**
 *This program is written to experiment with the use of the <br>
 * "print" and "println" methods, variables and arithmetic operations. <br>
 * @author Mason Bourgeois
 * <pre>
 * Date: 2/1/2023
 * Course: CSC 1350 Section: 1 Lab: 1
 * Instructor: Dr. Duncan
 * </pre>
 */
public class OutputDemo {

    public static void main(String[] args)
    {
        System.out.println("first name: John ");
        System.out.println(" last name: Tyler");
        int first = 3, second = 8;
        System.out.println("first = "+ first + ", second = "+second);
        double average = (first + second) / 2.0;
        System.out.println("Average = " + average);
        String firstName = "John";
        System.out.println("first name: " + firstName);
        String name = "John Tyler";
        System.out.println("name: " + name);
        System.out.println("3/5*5 = " + (3.5*5));
        System.out.println("3/5*5.0 = " + (3/5*5.0));
        System.out.println("3/5.0*5 = " + (3/5.0*5));
        float length = 30;
        float width = 40;
        System.out.println("diagonal = sqroot(length^2 + width^2) = sqroot(...^"
                            + "2 + ...^2) = " + Math.sqrt(Math.pow(length, 2) +
                            Math.pow(width, 2)));
    }
}
