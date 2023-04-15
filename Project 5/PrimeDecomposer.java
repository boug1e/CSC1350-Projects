package com.mycompany.primedecomposer;
import java.util.Scanner;
/**
 *The class PrimeDecomposer takes a number from the user, factors it, and lists its primes. <br>
 * @author Mason Bourgeois
 * <pre>
 * Date: 3/8/2023
 * Couse: csc 1350 Section 1
 * Instructor: Dr. Duncan
 * Lab: 5
 * </pre>
 */
public class PrimeDecomposer {

    public static void main(String[] args) {
        System.out.print("Enter an integer to generate its prime decomposition -> ");
        Scanner cin = new Scanner(System.in);
        long prime = cin.nextLong();
         if (prime < 2) {
            System.out.printf("FactorInteger[%d] = NaN", prime);
        }else{
            System.out.printf("FactorInteger[%d] =", prime);
            int dupe = 0;
            for (int factor = 2; factor <=prime; factor++) {
                if (prime % factor == 0) {
                    int factorCount = 0;
                    while (prime % factor == 0) {
                        factorCount++;
                        prime /= factor;
                    }
                    if (dupe == 0) {
                        System.out.printf(" %d%s ", factor, (factorCount > 1 ? "^" + factorCount : ""));
                    }else{
                        System.out.printf("x %d%s ", factor, (factorCount > 1 ? "^" + factorCount : ""));
                    }
                    dupe = factorCount;
                }
            }
         }
    }
}
