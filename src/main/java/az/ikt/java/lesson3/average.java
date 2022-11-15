package az.ikt.java.lesson3;

import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        double[] a = new double[n];
        double  sum = 0;
        double h;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        h=sum/n;
        System.out.printf("The average value of array elements = %s", h);
    }

}
