/**
 * Data Structures and Algorithms: Binary Search Algorithm implementation
 */

package dev.itsvidhanreddy.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

  public static int binarySearch(int[] arr, int se) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (se == arr[mid]) {
        return 1;
      } else if (se < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return 0;
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

    Arrays.sort(arr);

    if (binarySearch(arr, se) == 1) {
      System.out.println(se + " is found");
    } else {
      System.out.println(se + " is not found");
    }

    sc.close();
  }
}