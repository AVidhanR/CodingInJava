/**
 * Program for sum of arithmetic series
 * [Formula]
 * Sum of arithmetic series
 *            = ((n / 2) * (2 * a + (n - 1) * d))
 *            Where
 *                a - First term
 *                d - Common difference
 *                n - No of terms
 * [About]
 * A series with the same common difference is known as arithmetic series.
 * The first term of series is a and the common difference is d.
 * The series looks like a, a + d, a + 2d, a + 3d, . . . Task is to find the sum of the series.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class SumOfArithmeticSeries {

  // this is better than the below one.
  public static double SumOfArithmeticSeriesEfficientSolution(
      double a,
      double d,
      double n
  ) {
    return ((n / 2) * (2 * a + (n - 1) * d));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a start number: ");
    double a = sc.nextDouble(), s = 0;

    System.out.print("Enter a number (d): ");
    double d = sc.nextDouble();

    System.out.print("Enter a number (n): ");
    double n = sc.nextDouble();

    System.out.println("Sum of Arithmetic Series (Using Efficient Solution) up to " + Math.round(n) + " is: " +
        SumOfArithmeticSeriesEfficientSolution(a, d, n));

    for (int i = 0; i < n; i++) {
      s += a;
      a += d;
    }

    System.out.println("Sum of Arithmetic Series up to " + Math.round(n) + " is: " + s);
    sc.close();
  }
}