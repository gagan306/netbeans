
package dictionarydemo;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class DictionaryDemo {
    public static void main(String[] args) {
        // Create a Dictionary
        Dictionary<String, String> countryCodes = new Hashtable<>();
        countryCodes.put("US", "United States");
        countryCodes.put("CA", "Canada");
        countryCodes.put("MX", "Mexico");

        // Display the Dictionary
        System.out.println("Country Codes:");
        Enumeration<String> keys = countryCodes.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + countryCodes.get(key));
        }
    }
}

