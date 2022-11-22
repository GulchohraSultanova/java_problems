package az.ikt.java.lesson1.lesson2.loop;

public class forLoop1 {
    public static void main(String[] args) {
        for(int i=1000;i<10000;i++)
        {
            int a=i/1000;
            int b=i/100%10;
            int c=i%100/10;
            int d=i%10;
            if(a+b==c+d)
                System.out.println(i);
        }

    }
}
