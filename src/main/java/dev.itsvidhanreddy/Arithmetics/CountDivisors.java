/**
 * Given an integer n, find the number of divisors of n that are divisible by 3.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class CountDivisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a integer number: ");
    int n = sc.nextInt(), c = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && n % i == 0) {
        c++;
      }
    }

    System.out.println("Number of divisors of " + n + " that are divisible by 3: " + c);
    sc.close();
  }
}