/**
 * Given an integer N, the task is to print half-diamond-star pattern.
 */
import java.util.Scanner;

public class HalfDiamondPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Upper triangle with n *'s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower triangle with n-1 *'s
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}