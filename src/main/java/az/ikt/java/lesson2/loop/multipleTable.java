package az.ikt.java.lesson2.loop;

import java.util.Scanner;

public class multipleTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf(" Enter the number: ");
            int n = sc.nextInt();
            if (n > 0) {
                for (int i = 1; i <= 10; i++)
                    System.out.printf("%s x %s = %s\n", n, i, n * i);
                break;
            }
        }
    }
}
