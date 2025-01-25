/**
 * Given a list of characters, merge all of them into a string.
 */

package dev.itsvidhanreddy.Strings;

import java.util.Scanner;

public class CharToString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    System.out.println("Enter the chars: ");
    char[] arr = new char[n];
    for (int i = 0; i < n; i++) {
      System.out.printf("Enter arr[%d]: ", i);
      arr[i] = sc.next().charAt(0);
    }

    System.out.println("The obtained string: " + new String(arr));
    sc.close();
  }
}