/**
 * Given an integer N, find the sum of odd numbers and even numbers from 1 to N.
 */
import java.util.Scanner;

public class SumOfOddEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), evenSum = 0, oddSum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of odd and even elements from 1 to " + n + " is: " + oddSum + ", " + evenSum);
        sc.close();
        return;
    }
}