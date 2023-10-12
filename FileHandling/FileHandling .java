import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("kholo.txt"))) {
		
		
            writer.write("Hello, World!");
			
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
