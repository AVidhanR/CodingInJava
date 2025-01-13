/**
 * Given a string str containing only lowercase letters,
 * generate a string with the same letters, but in uppercase
 */
import java.util.Scanner;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println(str + " => In Upper Case => " + str.toUpperCase());
        sc.close();
    }
}