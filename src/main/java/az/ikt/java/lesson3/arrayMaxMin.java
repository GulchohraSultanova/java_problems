package az.ikt.java.lesson3;

import java.util.Scanner;

public class arrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the count of array elements: ");
        int n = sc.nextInt();
        int j=0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }
}
