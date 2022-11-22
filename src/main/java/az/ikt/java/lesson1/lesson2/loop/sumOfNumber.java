package az.ikt.java.lesson1.lesson2.loop;

import java.util.Scanner;

public class sumOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Sum of first %s number= %s\n", n, sum);
    }
}
