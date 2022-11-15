package az.ikt.java.lesson3;

import java.util.Scanner;

public class hackerRank5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for(int i=0;i<h;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int p=a+b;
            System.out.printf(p+" ");
            for(int j=1;j<n;j++) {
                p += b * Math.pow(2, j);
                System.out.printf(p + " ");
            }
            System.out.println();
        }
    }
}
