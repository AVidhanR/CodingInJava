/**
 * Data Structures and Algorithms: Binary Search Algorithm implementation
 */

package dev.itsvidhanreddy.DSA;

import java.util.Scanner;

public class SelectionSort {

  public static void selectionSort(int[] arr) {
    int minIndex = -1;
    int length = arr.length;
    int temp = 0;

    // length - 1 => because the last value is already sorted!
    for (int i = 0; i < length - 1; i++) {
      minIndex = i;
      for (int j = i; j < length; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }
      temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
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

    selectionSort(arr);

    System.out.println("Sorted array using Selection Sort: ");
    for (int ele : arr) {
      System.out.print(ele + " ");
    }

    sc.close();
  }
}