/**
 * Given a positive integer n, count the number of digits in
 * n that divide n evenly (i.e., without leaving a remainder).
 * Return the total number of such digits.
 */
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), c = 0, t = n;
        int l = String.valueOf(n).length();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++, n /= 10) {
            arr[i] = n % 10;

            // => don't change the below order! LTR =>
            if (t % arr[i] == 0) {
                c++;
            }
        }

        System.out.println("Total number of digits divided by " + t + " is/are: " + c);
        sc.close();
        return;
    }
}