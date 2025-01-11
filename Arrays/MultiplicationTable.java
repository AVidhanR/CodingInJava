/**
 * Create the multiplication table of a given number N and return the table as an array.
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] mt = new int[10];

        for (int i = 1; i <= 10; i++) {
            mt[i-1] = n * i;
        }

        System.out.println("The Multiplication table of " + n + " is: ");
        for (int ele : mt) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}