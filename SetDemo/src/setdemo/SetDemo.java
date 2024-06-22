
package setdemo;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet Example
        Set<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Duplicate, will be ignored
        System.out.println("HashSet: " + cities);

        // TreeSet Example
        Set<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        System.out.println("TreeSet: " + countries);
    }
}


