package az.ikt.java.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class arraySimple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        System.out.printf("Sorted array= ");
        for(int num:a)
            System.out.printf(num+" ");
    }
}
