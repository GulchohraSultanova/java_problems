package az.ikt.java.lesson7;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<Integer>();

        // Adding elements into the TreeSet
        // using add()
        ts.add(5);
        ts.add(2);
        ts.add(1);
//        System.out.println(ts.subSet(1,6));

        // Adding the duplicate
        // element
        ts.add(Integer.valueOf("India"));

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<Integer> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
    }
//}
//