/**
 * Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…
 */
import java.util.Scanner;

public class FindNthTerm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    for (
        int i = 0, j = 1;
        i <= n;
        i += j
    ) {

    }

    sc.close();
  }
}