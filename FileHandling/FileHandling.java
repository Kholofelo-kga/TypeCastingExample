import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
            writer.write("\nThis is an appended line.");
            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
