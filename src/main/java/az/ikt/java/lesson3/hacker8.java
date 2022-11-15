package az.ikt.java.lesson3;

import java.util.Scanner;

public class hacker8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if (a >= -128 && a <= 127)
                System.out.printf(a + " can be fitted in:\n* byte\n* short\n* int\n* long\n");
            else if (a >= -Math.pow(2, 15) && a <= Math.pow(2, 15) - 1)
                System.out.printf(a + " can be fitted in:\n* short\n* int\n* long\n");
            else if (a >= -Math.pow(2, 31) && a <= Math.pow(2, 31) - 1)
                System.out.printf(a + " can be fitted in:\n* int\n* long\n");
            else if (a >= -Math.pow(2, 63) && a <= Math.pow(2, 63) - 1)
                System.out.printf(a + " can be fitted in:\n* long\n");
            else if (a > Long.MAX_VALUE) System.out.println(sc.next() + " can't be fitted anywhere.\n");
        }
    }
}
