package az.ikt.java.lesson9;

import java.io.File;

public class file1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\IdeaProjects\\java_problems\\src\\main\\resources\\file.java");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.getMessage();
            }
        } else {
            file.delete();
        }
    }
}
