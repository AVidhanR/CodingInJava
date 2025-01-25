/**
 * Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class FindNthTerm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    for (
        int i = 1, j = 2, c = 1;
        c <= n;
        i += j, c++, j++
    ) {
      if (c == n) {
        System.out.println("The " + n + "th term is: " + i);
        break;
      }
    }

    sc.close();
  }
}