
package fileinputstreamexample;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamExample {

    public static void main(String[] args) {
              try (FileInputStream inputStream = new FileInputStream("exampleFileInputStream.txt")) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
                  System.out.println(e);
        }

    }
    
}
