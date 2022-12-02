package az.ikt.java.lesson2;

import java.util.Scanner;

public class nByN_Matrix {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the number : ");
        int n=sc.nextInt();
        System.out.printf("N-by-n Matrix is : \n\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("0");
            }
            System.out.println();
        }
    }
}
