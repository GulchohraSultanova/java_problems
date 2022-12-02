package az.ikt.java.lesson5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listSort {

    public static void main(String[] args) {
        List<Integer>  ints=new ArrayList<>();
        int a;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            ints.add(i,sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(ints.get(i)>ints.get(j)) {
                    a = ints.get(i);
                    ints.set(i, ints.get(j));
                    ints.set(j,a);
                }

            }

        }
        System.out.println(ints);
    }
}
