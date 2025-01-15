/**
 * Given three integers p, r and t, denoting Principal,
 * Rate of Interest and Time period respectively. Your task is to calculate Simple Interest.
 */
import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter principal amount: ");
    int p = sc.nextInt();

    System.out.print("Enter rate of interest: ");
    int roi = sc.nextInt();

    System.out.print("Enter time period: ");
    int tp = sc.nextInt();

    double simpleInterest = (p * tp * roi) / 100;

    System.out.println("Simple Interest: " + simpleInterest);
    sc.close();
  }
}