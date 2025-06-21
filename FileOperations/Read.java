package FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        String filePath="D:\\java\\learning\\FileOperations\\file.txt";
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("FIle not found");
        } catch (IOException e) {
           System.out.println("error");
        }
    }
}
