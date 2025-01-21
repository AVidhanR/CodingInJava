/**
 * Different ways to take input
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TypesOfInputTaking {
  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    System.out.println(num);

    System.out.println("Enter another number: ");
    Scanner sc = new Scanner(System.in);
    int num2 = sc.nextInt();
    System.out.println(num2);

    sc.close();
    br.close();
  }
}