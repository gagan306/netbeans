
package hashtabledemo;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Double> productPrices = new Hashtable<>();
        productPrices.put("Laptop", 999.99);
        productPrices.put("Smartphone", 699.49);
        productPrices.put("Tablet", 399.89);

        // Display the Hashtable
        System.out.println("Product Prices:");
        productPrices.forEach((product, price) -> System.out.println(product + ": $" + price));

        // Check for a key and value
        System.out.println("\nContains 'Laptop': " + productPrices.containsKey("Laptop"));
        System.out.println("Contains price 699.49: " + productPrices.containsValue(699.49));

        // Remove an element
        productPrices.remove("Tablet");
        System.out.println("\nAfter removing 'Tablet': " + productPrices);
    }
}