/**
 * Given an array arr[]. The task is to find the mean (floor value) of the array.
 */

package dev.itsvidhanreddy.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MeanOfAnArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt(), s = 0;
    double m = 0;

    int[] arr = new int[n];
    System.out.println("Enter elements into the array: ");
    for (int i = 0; i < n; i++) {
      System.out.printf("Enter arr[%d]: ", i);
      arr[i] = sc.nextInt();
    }

    s = Arrays.stream(arr).sum();
    m = Math.floor((double) s / n);

    System.out.println("The mean of given array: " + m);
    sc.close();
  }
}