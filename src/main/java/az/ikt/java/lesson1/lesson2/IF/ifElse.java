package az.ikt.java.lesson1.lesson2.IF;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter the any number:");
        int num = obj.nextInt();
        if(num==0 || num==1 || num==2 || num==3 || num==4)
            System.out.println("Suspenso");
        else if(num==5)
            System.out.println("Aprobado");
        else if(num==6)
            System.out.println("Bien");
        else if(num==7 || num==8)
            System.out.println("Notable");
        else if(num==9 || num==10)
            System.out.println("Sobresaliente");
        else
            System.out.println("Error");


    }
}
