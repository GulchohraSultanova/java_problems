package az.ikt.java.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pellnumbers {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        list.add(Long.valueOf((Integer) 0));
        list.add(Long.valueOf((Integer) 1));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            list.add(i + 1, list.get(i) * 2 + list.get(i - 1));
        }
        System.out.println(list);
    }
}
