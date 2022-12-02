package az.ikt.java.lesson6;

import java.util.LinkedList;
import java.util.List;

public class arrayList {


    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        System.out.println(list.size());
        list.add(5);
        System.out.println(list.get(0));

    }
}
