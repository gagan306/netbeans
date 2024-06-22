
package singledimensionalarraydemo;

public class SingleDimensionalArrayDemo {
    public static void main(String[] args) {
        // Create a single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display elements of the array
        System.out.println("Single-Dimensional Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Access a specific element
        int secondElement = numbers[1];
        System.out.println("The second element is: " + secondElement);

        // Modify an element
        numbers[3] = 100;
        System.out.println("Array after modification:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
