/**
 * Data Structures and Algorithms: Linear Search Algorithm implementation
 */

package dev.itsvidhanreddy.SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {

  public static int linearSearch(int[] arr, int se) {
    for (int i : arr) {
      if (i == se) return 1;
    }
    return 0;
  }

  public static String linearSearchWithIndex(int[] arr, int se) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == se) return ("Element " + se + " is found under index " + i);
    }
    return "Element " + se + " not found";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter elements into the array: ");
    for (int i = 0; i < n; i++) {
      System.out.printf("Enter arr[%d]: ", i);
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the search element: ");
    int se = sc.nextInt();

    if (linearSearch(arr, se) == 1) {
      System.out.println(se + " is found");
    } else {
      System.out.println(se + " is not found");
    }

    System.out.println(linearSearchWithIndex(arr, se));

    sc.close();
  }
}