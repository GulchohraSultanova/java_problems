package az.ikt.java.lesson3;

import java.util.Scanner;

public class sumArray {

    public static int findSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
