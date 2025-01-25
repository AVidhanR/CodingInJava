/**
 * Given a English alphabet c, Write a program to check whether a character is a vowel or not.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class CheckVowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String v = "aeiouAEIOU";
        boolean isV = false;

        System.out.print("Enter the character: ");
        String input = sc.next();
        char ch = input.charAt(0);

        for (char c : v.toCharArray()) {
            if (ch == c) {
                isV = true;
                break;
            }
        }

        if (isV) {
            System.out.println(ch + " is an vowel.");
        } else {
            System.out.println(ch + " is not an vowel.");
        }

        sc.close();
    }
}