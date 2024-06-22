
package filereaderexample;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {
    public static void main(String[] args) {
       try (FileReader reader = new FileReader("exampleFileReader.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
