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
        int n = sc.nextInt(), c = 0, t = n, l = String.valueOf(n).length();

        for (int i = 0; i < l; i++, n /= 10) {
            if (n % 10 != 0 && t % (n % 10) == 0) {
                c++;
            }
        }

        System.out.println("Total number of digits divided by " + t + " is/are: " + c);
        sc.close();
    }
}