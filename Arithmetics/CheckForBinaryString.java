import java.util.Scanner;

public class CheckForBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        boolean ib = false;

        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                ib = true;
            } else {
                ib = false;
                break;
            }
        }

        if (ib == true) {
            System.out.println(s + " is a binary.");
        } else {
            System.out.println(s + " is not a binary.");
        }
        sc.close();
    }
}