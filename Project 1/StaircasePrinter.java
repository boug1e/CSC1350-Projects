
package com.mycompany.staircaseprinter;
/**
 * This program displays a text-based representation of a staircase <br>
 * in two ways. first, by using a series of 'println' statements and <br>
 * a second time using one 'println' statement to <br>.
 * @author Mason Bourgeois
 * <pre>
 * Date: 1/25/2023
 * Course: CSC 1350 Section: 1
 * Lab: 0
 * Instructor: Dr. Duncan
 * </pre>
 */
public class StaircasePrinter {

    public static void main(String[] args) {
        System.out.println("            +---+");
        System.out.println("            |   |");
        System.out.println("        +---+---+");
        System.out.println("        |   |   |");
        System.out.println("    +---+---+---+");
        System.out.println("    |   |   |   |");
        System.out.println("+---+---+---+---+");
        System.out.println("|   |   |   |   |");
        System.out.println("+---+---+---+---+");
        
        System.out.println("\n" + 
                           "            +---+ \n" +
                           "            |   | \n" + 
                           "        +---+---+ \n" +
                           "        |   |   | \n" +
                           "    +---+---+---+ \n" +
                           "    |   |   |   | \n" +
                           "+---+---+---+---+ \n" +
                           "|   |   |   |   | \n" +
                           "+---+---+---+---+ \n");          
    }
}
