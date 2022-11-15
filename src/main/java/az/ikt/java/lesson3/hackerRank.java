package az.ikt.java.lesson3;

import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n==2 || n==4)
            System.out.println("Not Weird");
        else if(n==3 || n==5)
            System.out.println("Weird");
        else if(n>5 && n<21 && n%2==0 )
            System.out.println("Weird");
        else if(n>20 && n%2==0)
            System.out.println("Not Weird");
        else if(n>20 && n%2==1)
            System.out.println("Weird");
    }
}
