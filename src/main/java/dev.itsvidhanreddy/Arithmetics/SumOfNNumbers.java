package dev.itsvidhanreddy.Arithmetics;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt(), sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum Of N Numbers : " + sum);
        sc.close();
    }
}