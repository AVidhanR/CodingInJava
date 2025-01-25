/**
 * Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class SumOfDigitsIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), s = 0, r = 0;

        for (; n != 0; n /= 10) {
            s += (n % 10);
        }

        for (n = s; n != 0; n /= 10) {
            r = (r * 10) + (n % 10);
        }

        if (r == s) {
            System.out.println("The Sum Of Digits " + s + " is a palindrome");
        } else {
            System.out.println("The Sum Of Digits " + s + " is not a palindrome");
        }

        sc.close();
    }
}