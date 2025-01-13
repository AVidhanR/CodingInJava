/**
 * Given a string. Count the number of Camel Case characters in it.
 */
import java.util.Scanner;

public class CountCamelCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s =  sc.nextLine();

    int count = 0;

    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        count++;
      }
    }

    System.out.println("The count of camel case's in given string \"" + s + "\" is: " + count);
    sc.close();
  }
}