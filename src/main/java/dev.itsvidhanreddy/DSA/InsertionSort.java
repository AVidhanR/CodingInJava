/**
 * Data Structures and Algorithms: Insertion Sort Algorithm implementation
 */

package dev.itsvidhanreddy.DSA;

import java.util.Scanner;

public class InsertionSort {

  public static void selectionSort(int[] arr) {
    int key = 0;
    int length = arr.length;

    for (int i = 1; i < length; i++) {
      key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
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

    System.out.println("Sorted array using Insertion Sort: ");
    for (int ele : arr) {
      System.out.print(ele + " ");
    }

    sc.close();
  }
}