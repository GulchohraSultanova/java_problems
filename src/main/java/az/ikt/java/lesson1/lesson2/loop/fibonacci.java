package az.ikt.java.lesson1.lesson2.loop;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        int f, f1 = 1, f2 = -1;
        for (int i = 0; i < n; i++) {
            f = f1 + f2;
            f2 = f1;
            f1 = f;
            System.out.printf(f + " ");
        }

    }
}
