/**
 * Calculate the product of all the elements in an array.
 */

package dev.itsvidhanreddy.Arrays;

import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt(), m = 1;

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements into the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int ele : arr) {
            m *= ele;
        }

        System.out.println("The Multiplication of elements in an array: " + m);
        sc.close();
    }
}