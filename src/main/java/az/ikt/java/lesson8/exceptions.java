package az.ikt.java.lesson8;

import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.printf("Enter 'a' : ");
            Integer a = sc.nextInt();
            System.out.printf("Enter 'b' : ");
            Integer b = sc.nextInt();
            System.out.printf("a / b = ");
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Execution failed !");
        } finally {
            System.out.println("Task is ended !");
        }
    }
}
