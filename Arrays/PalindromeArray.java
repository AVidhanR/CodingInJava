/**
 * Given an array arr, the task is to find whether the arr is palindrome or not.
 * If the arr is palindrome then return true else return false.
 */
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        boolean cp = false;

        int[] arr = new int[n], copyArr = new int[n];
        System.out.println("Enter elements into the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter value into arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1, j = 0; i >= 0 && j < n; i--, j++) {
            copyArr[j] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (copyArr[i] == arr[i]) {
                cp = true;
            } else {
                cp = false;
            }
        }

        if (cp) {
            System.out.println("The given array is a Palindrome Array");
        } else {
            System.out.println("The array is Not a Palindrome array");
        }

        sc.close();
    }
}