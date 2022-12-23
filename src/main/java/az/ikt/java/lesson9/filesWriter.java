package az.ikt.java.lesson9;

import java.io.File;
import java.io.FileWriter;

public class filesWriter {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\IdeaProjects\\java_problems\\src\\main\\resources\\file.java");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("ZAKIR GULU");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
