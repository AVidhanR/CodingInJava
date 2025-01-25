/**
 * Data Structures and Algorithms: Bubble Sort Algorithm implementation
 */

package dev.itsvidhanreddy.DSA;

import java.util.Scanner;

public class BubbleSort {

  public static void bubbleSort(int[] arr) {
    int pass = arr.length;
    int temp = 0;

    for (int i = 0; i < pass; i++) {
      // no need to check for already sorted ones!
      // so used the pass concept...
      for (int j = 0; j < pass - i - 1; j++) {
        // ascending order
        if (arr[j] > arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

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

    bubbleSort(arr);

    for (int ele : arr) {
      System.out.print(ele + " ");
    }

    sc.close();
  }
}