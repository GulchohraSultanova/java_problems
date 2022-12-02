package az.ikt.java.lesson7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set.add(2));
    }
}
