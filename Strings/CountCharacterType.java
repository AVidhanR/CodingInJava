/**
 * Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters,
 * Special characters and Numeric values in the string. Note: There are no white spaces in the string.
 */
import java.util.Scanner;

public class CountCharacterType {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s =  sc.nextLine().trim();

    int l = 0, u = 0, sp = 0, numbs = 0;

    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        u++;
      } else if (Character.isLowerCase(c)) {
        l++;
      } else if (Character.isDigit(c)) {
        numbs++;
      } else {
        sp++;
      }
    }

    System.out.printf("Counts of, \nLower case chars: %d\nUpper case chars; %d\nSpecial chars: %d" +
        "\nNumeric values: %d in the given string \"%s\"", l, u, sp, numbs, s);
    sc.close();
  }
}