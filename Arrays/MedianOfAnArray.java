/**
 * Given an array arr[] of integers, calculate the median.
 */
import java.util.Arrays;
import java.util.Scanner;

public class MedianOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements into the array: ");
        for(int i = 0; i < n; i++) {
            System.out.printf("Enter element arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n % 2 == 0) {
            System.out.println("The median of given elements: " + ((double) (arr[n/2] + arr[(n/2) - 1]) / 2));
        } else {
            System.out.println("The median of given elements: " + arr[n/2]);
        }

        sc.close();
    }
}