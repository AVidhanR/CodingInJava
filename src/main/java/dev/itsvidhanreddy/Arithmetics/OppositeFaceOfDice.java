/**
 * You are given a cubic dice with 6 faces. All the individual faces have a number printed on them.
 * The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with
 * a face of this cube, your task is to guess the number on the opposite face of the cube.
 */

package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class OppositeFaceOfDice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    if (n > 6 || n < 1) return;

    System.out.println("The Opposite side of " + n + " a dice is: " + (7 - n));
    sc.close();
  }
}