/**
 * Just basic String experiments: StringBuffer, StringBuilder
 */
import java.util.Scanner;

public class ExperimentingOnStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // mutable string
    StringBuffer sbr = new StringBuffer("AVidhanR");
    sbr.append(" CSE Student");

    // immutable string - in the sense that it creates a new string constant in the pool
    // rather than changing the existing one.
    String s = sbr.toString();

    System.out.println("Data: " + sbr + " \nCapacity: " + sbr.capacity() + " \nReverse: " + sbr.reverse() +
        " \nString itself: " + s);
    sc.close();
  }
}