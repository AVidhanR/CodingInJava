/**
 * Given a string, remove all spaces from it.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        s = s.replace(" ", "");

        System.out.println("After removing spaces: " + s);
        sc.close();
    }
}