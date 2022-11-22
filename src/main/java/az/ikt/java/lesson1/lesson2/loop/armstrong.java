package az.ikt.java.lesson1.lesson2.loop;

public class armstrong {

    public static void main(String[] args) {
        int a, b, c, sum = 0;
        for (int i = 1; i < 500; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                sum++;
                System.out.printf("%s. armstrong number = %s\n", sum, i);
            }
        }
    }
}