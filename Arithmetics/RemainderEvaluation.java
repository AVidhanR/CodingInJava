/**
 * Given two positive integers num1 and num2,
 * the task is to find the remainder when num1 is divided by num2.
 */
import java.util.Scanner;

public class RemainderEvaluation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int n1 = sc.nextInt();

    System.out.print("Enter second number: ");
    int n2 = sc.nextInt();

    System.out.printf("Remainder of %d, %d is: %d", n1, n2, (n1 % n2));
    sc.close();
  }
}