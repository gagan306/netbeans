package serializationdemo;
import java.io.*;
// Define a class that implements Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Version control for serialization

    private final String name;
    private final int age;
    private final String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
public class SerializationDemo {

    public static void main(String[] args) {
      // Create a Person object
        Person person = new Person("John Doe", 30, "123 Street, Kathmandu");

        // Serialize object
        serializePerson(person);
    }

    private static void serializePerson(Person person) {
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Person object serialized and saved to person.ser");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
