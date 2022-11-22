package az.ikt.java.lesson1.lesson2.loop;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        int m, a = 0;
        while (n != 0) {
            m = n % 10;
            a = a * 10 + m;
            n = n / 10;
        }
        System.out.printf("Reversed number = %s", a);

    }
}
