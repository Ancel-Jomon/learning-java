package FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        

        

        try (FileWriter writer = new FileWriter("FileOperations\\file.txt")) {
            writer.write("writing to file");
            System.out.println("file writing complete");
        } catch (IOException e) {
           System.out.println("File operation failed");
        }
    }
}
