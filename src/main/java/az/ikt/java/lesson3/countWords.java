package az.ikt.java.lesson3;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
    }
    public static void countWords(String a,int sum) {
        for (int j = 0; j < a.length(); j++) {
            for (int i = 'A'; i <= 'Z'; i++) {
                if (a.charAt(j) == i) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
