
package filecopycharacterstream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopyCharacterStream {

    public static void main(String[] args) {
      String sourceFile = "sourceFile.txt";
        String destinationFile = "destinationFile.txt";

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully using character streams.");
        } catch (IOException e) {
            System.out.println(e);
        }  
    }
    
}
