package az.ikt.java.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("RED","GREEN","ORANGE","PINK","BLACK");
        List<String> lis1=Arrays.asList("RED","GREEN","PINK","BLACK");
        List<String> list2=new ArrayList<>();
        list2.addAll(list);
        list2.addAll(lis1);
        System.out.println(list2);



    }
}
