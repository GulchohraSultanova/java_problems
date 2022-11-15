package az.ikt.java.lesson2.loop;

import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n= sc.nextInt();
        int fak=1;
        for(int i=1;i<=n;i++)
        {
            fak*=i;
        }
        System.out.printf("The value of %s! = %s",n,fak);
    }

}
