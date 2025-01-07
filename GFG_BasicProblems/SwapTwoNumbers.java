/**
 * Swap given two numbers and print them.
 */
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After swapping a = " + a + " & b = " + b);
        sc.close();
    }
}