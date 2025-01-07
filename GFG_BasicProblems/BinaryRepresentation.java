/**
 * program to print Binary representation of a given number N
 */
import java.util.Scanner;

public class BinaryRepresentation {

    public static String ShortBinaryRepresentation(int n) {
        String b = Integer.toBinaryString(n);
        return String.format("%30s", b).replace(" ", "0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        String b = "";

        for (int t = n; t > 0; t /= 2) {
            b = (t % 2) + b;
        }

        for (;b.length() < 30;) {
            b = "0" + b;
        }

        System.out.println("Binary representation of " + n + " is: " + b);

        System.out.println("Binary representation of (using abstract java in-built methods) " + n + " is: " + ShortBinaryRepresentation(n));
        sc.close();
    }
}