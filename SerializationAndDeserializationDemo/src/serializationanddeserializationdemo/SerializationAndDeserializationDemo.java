
package serializationanddeserializationdemo;
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
public class SerializationAndDeserializationDemo {

    public static void main(String[] args) {
     Person person = new Person("John Doe", 30);
        String filename = "person.txt";

        // Serialize the Person object
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialization completed.");
        } catch (IOException i) {
            System.out.println(i);
        }

        // Deserialize the Person object
        Person deserializedPerson = null;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialization completed.");
        } catch (IOException i) {
            System.out.println(i);
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found.");
            System.out.println(c);
        }

        System.out.println("Deserialized Person: " + deserializedPerson);
    }
    
}
