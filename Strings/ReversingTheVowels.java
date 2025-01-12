/**
 * Given a string consisting of lowercase english alphabets,
 * reverse only the vowels present in it and print the resulting string.
 */
import java.util.Scanner;

public class ReversingTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase(), v = "aeiou", vs = ""; // in any case

        for (char c : s.toCharArray()) {
            if (v.indexOf(c) != -1) {
                vs += c;
            }
        }
        StringBuilder sb = new StringBuilder(vs);
        vs = sb.reverse().toString();

        char[] sArr = s.toCharArray();
        char[] vsArr = vs.toCharArray();

        for (
            int i = 0, j = 0;
            i < sArr.length && j < vsArr.length;
            i++
        ) {
            if (v.indexOf(sArr[i]) != -1) {
                sArr[i] = vsArr[j];
                j++;
            }
        }

        System.out.println(new String(sArr));
        sc.close();
    }
}