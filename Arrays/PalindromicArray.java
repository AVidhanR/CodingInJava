/**
 * Given an array arr[] of positive integers.
 * Return true if all the array elements are palindrome otherwise, return false.
 */
import java.util.Scanner;

public class PalindromicArray {
    public static boolean isPalindrome(int a) {
        int t = a, r = 0;
        for (; a != 0; a /= 10) {
            r = (r * 10) + (a % 10);
        }

        return (r == t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        boolean check = false;

        int[] arr = new int[n];
        System.out.println("Enter elements into the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter arr[%d] element: ", i);
            arr[i] = sc.nextInt();
        }

        for (int ele : arr) {
            if (isPalindrome(ele)) {
                check = true;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Given array is a palindrome");
        } else {
            System.out.println("Not a palindrome array");
        }

        sc.close();
    }
}