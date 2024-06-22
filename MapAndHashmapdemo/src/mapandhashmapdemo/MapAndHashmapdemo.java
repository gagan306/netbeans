
package mapandhashmapdemo;
import java.util.HashMap;
import java.util.Map;
public class MapAndHashmapdemo {

    public static void main(String[] args) {
     Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Lion", 4);
        map.put("Elephant", 2);
        map.put("Giraffe", 5);

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + map);

        // Accessing values
        System.out.println("Value for key 'Lion': " + map.get("Lion"));

        // Checking for a key
        System.out.println("Contains key 'Elephant'? " + map.containsKey("Elephant"));

        // Removing a key-value pair
        map.remove("Giraffe");

        // Displaying the HashMap after removal
        System.out.println("HashMap after removal: " + map);

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
   