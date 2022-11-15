package az.ikt.java.lesson3;

import java.util.Scanner;

public class hackerRank4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            String s2=sc.next();
            int c=15-s1.length();
            System.out.printf(s1);
            for(int j=0;j<c;j++)
            {
                System.out.printf(" ");
            }
            if(s2.length()==2)
                System.out.printf("0"+s2);
            else if(s2.length()==1)
                System.out.printf("00"+s2);
            else
                System.out.printf(s2);
            System.out.println();
        }
        System.out.println("================================");
    }
}
