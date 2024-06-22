
package filewriterexample;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Hello, this is a test using FileWriter.";
        
        try (FileWriter writer = new FileWriter("exampleFileWriter.txt")) {
            writer.write(content);
            System.out.println("File created and content written using FileWriter.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
