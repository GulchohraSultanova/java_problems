package az.ikt.java.lesson6;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class addAll {

    public static void main(String[] args) {

        List<Integer> list =new LinkedList<>() ;
        List<Integer> list1 =new LinkedList<>() ;
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.sort(list);
        list.remove("ana");
        list1.addAll(list);
        System.out.println(list1);
    }
}
