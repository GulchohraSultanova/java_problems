package az.ikt.java.lesson9;

import java.io.File;

public class files {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\IdeaProjects\\java_problems\\src\\main\\resources\\file.java");

        if (!file.exists()) {
            try {
                boolean value = file.createNewFile();
                if (value) {
                    System.out.println("Great");
                }
            } catch (Exception e) {
                e.getMessage();
            }
        } else {
            file.delete();
            System.out.println("Bad");
        }
    }
}
