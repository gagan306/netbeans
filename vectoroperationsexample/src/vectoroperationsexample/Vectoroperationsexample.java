
package vectoroperationsexample;
import java.util.Vector;
public class Vectoroperationsexample {

   
    public static void main(String[] args) {
         Vector<String> fruits = new Vector<>();

        // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial Vector: " + fruits);

        // Access an element
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Vector after removing Banana: " + fruits);

        // Iterate over the elements
        System.out.print("Iterating over Vector: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Check if Vector contains an element
        boolean hasCherry = fruits.contains("Cherry");
        System.out.println("Vector contains Cherry: " + hasCherry);

        // Get the size of the Vector
        int size = fruits.size();
        System.out.println("Size of Vector: " + size);
    }
    
}
