/**
 * Given a number n. Find the sum of all the digits of n.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int n = sc.nextInt(), t = n, sum = 0;

        for (;n > 0;) {
            sum += (n % 10);
            n /= 10;
        }

        System.out.println("Sum of digits of " + t + " is: " + sum);
        sc.close();
    }
}