/**
 * Given a string consisting of lowercase english alphabets,
 * reverse only the vowels present in it and print the resulting string.
 */
import java.util.Scanner;

public class ReversingTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase(), v = "aeiou", r = ""; // in any case

        boolean vc = false;

        for (char c : s.toCharArray()) {
            if (v.indexOf(c) != -1) {
                r += c;
            }
        }

//        for (int i = r.length() - 1, j = 0; i >= 0 && j < r.length(); i--, j++) {
//            if (r.charAt(i) == r.charAt(j)) {
//                vc = true;
//            } else {
//                vc = false;
//                break;
//            }
//        }

        // Nice problem

//        if (vc) {
//            System.out.println("It's reverse is equal! " + s);
//        }

        System.out.println(r);
        sc.close();
    }
}