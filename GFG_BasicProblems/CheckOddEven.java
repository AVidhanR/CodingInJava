/** Q:
 * Given a positive integer n, determine whether it is odd or even.
 */

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }

        sc.close();
    }
}