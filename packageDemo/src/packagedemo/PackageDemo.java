
package packagedemo;
import packagedemo.subpackage.subpackage;
public class PackageDemo {

    
    public static void main(String[] args) {
        System.out.println("this is from the main package!");
        subpackage subClass = new subpackage();
        subClass.displayMessage();
    }
    
}
