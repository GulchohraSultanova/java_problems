package az.ikt.java.lesson3;

import java.util.Scanner;

public class arrayIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the count of array elements: ");
        int n = sc.nextInt();
        System.out.printf("\nEnter the number: ");
        int h = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (a[n - 1] == h) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
