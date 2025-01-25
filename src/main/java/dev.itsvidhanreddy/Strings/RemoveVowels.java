/**
 * Given a string, remove the vowels from the string.
 */

package dev.itsvidhanreddy.Strings;

import java.util.Scanner;

public class RemoveVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = sc.nextLine(), v = "aeiouAEIOU";

    for (char c : s.toCharArray()) {
      if (v.indexOf(c) != -1) {
        continue;
      }
      System.out.print(c);
    }

    sc.close();
  }
}