/**
 * You are given an integer n. Your task is to reverse the digits,
 * ensuring that the reversed number has no leading zeroes.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), r = 0;

        for (; n != 0; n /= 10) {
            r = (r * 10) + (n % 10);
        }

        System.out.println("Reversed digits is: " + r);
        sc.close();
    }
}