/**
 * Different ways to take input
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypesOfInputTaking {
  public static void main(String[] args) throws IOException {
    System.out.print("Enter a number: ");

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int num = Integer.parseInt(br.readLine());

    System.out.println(num);

    isr.close();
    br.close();
  }
}