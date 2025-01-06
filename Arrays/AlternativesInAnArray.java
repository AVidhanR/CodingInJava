/**
 * You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).
 */
import java.util.Scanner;

public class AlternativesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements into the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
        return;
    }
}