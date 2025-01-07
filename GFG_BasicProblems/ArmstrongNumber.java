/**
 * Given a number x, determine whether the given number is Armstrong’s number or not.
 */
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), l = String.valueOf(n).length(), t = n, an = 0;

        for (; n != 0; n /= 10) {
            an += Math.pow((n % 10), l);
        }

        if (an == t) {
            System.out.println(t + " is an Armstrong number.");
        } else {
            System.out.println(t + " is not an Armstrong number.");
        }

        sc.close();
    }
}