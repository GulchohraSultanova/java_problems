package az.ikt.java.lesson3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numberFactorial(n));
    }
    public static int numberFactorial(int n)
    {
        return n==0 ? 1: n*numberFactorial(n);

    }
}
