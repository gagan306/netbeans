
package fileoutputstreamexample;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String content = "Hello, this is a test using FileOutputStream.";
        
        try (FileOutputStream outputStream = new FileOutputStream("exampleFileOutputStream.txt")) {
            byte[] contentBytes = content.getBytes();
            outputStream.write(contentBytes);
            System.out.println("File created and content written using FileOutputStream.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
