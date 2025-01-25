/**
 * Given 3 numbers A, B and C. Find the greatest number among them.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int max = Math.max(Math.max(a, b), c);

        System.out.printf("The greatest of %d, %d and %d is: %d", a, b, c, max);
        sc.close();
    }
}