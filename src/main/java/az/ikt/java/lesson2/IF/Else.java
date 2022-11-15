package az.ikt.java.lesson2.IF;

import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        System.out.println("Enter the symbol:\n");
        Scanner scanner= new Scanner(System.in);
        String sym=scanner.nextLine();
        int h=sym.length();
        sym=sym.toLowerCase();
        if(h>1)
        {
            System.out.println("Error");
        }
        else
        {
            if(sym.equals("a") || sym.equals("e") || sym.equals("i") || sym.equals("o") || sym.equals("u"))
            {
                System.out.println("The entered symbol is vowel");
            }
            else if(sym.equals("b") || sym.equals("c") ||sym.equals("d") ||sym.equals("f") ||sym.equals("g") ||sym.equals("j") ||sym.equals("k") ||sym.equals("l") ||sym.equals("m") ||sym.equals("n") ||sym.equals("p") ||sym.equals("q") ||sym.equals("s") ||sym.equals("t") ||sym.equals("v") ||sym.equals("x") ||sym.equals("z") ||sym.equals("h") ||sym.equals("r") ||sym.equals("w") ||sym.equals("y") )
            {
                System.out.println("The entered symbol is Consonant");
            }
            else
            {
                System.out.println("Error@");
            }
        }
    }
}
