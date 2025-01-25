package dev.itsvidhanreddy.Strings;

import java.util.Scanner;

public class OptimizedReversingTheVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        String vowels = "aeiou";
        char[] sArr = s.toCharArray();
        int left = 0, right = sArr.length - 1;

        while (left < right) {
            if (vowels.indexOf(sArr[left]) == -1) {
                left++;
            } else if (vowels.indexOf(sArr[right]) == -1) {
                right--;
            } else {
                // Swap vowels
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(sArr));
        sc.close();
    }
}