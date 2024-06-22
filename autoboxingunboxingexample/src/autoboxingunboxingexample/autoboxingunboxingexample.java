package autoboxingunboxingexample;

public class autoboxingunboxingexample {
    public static void main(String[] args) {
        // Autoboxing: int to Integer
        Integer boxedInt = 10;

        // Unboxing: Integer to int
        int unboxedInt = boxedInt;

        // Autoboxing in method call
        Integer result = addFive(boxedInt);

        // Display results
        System.out.println("Boxed int: " + boxedInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Result after adding five: " + result);
    }

    // Method that takes an Integer object (autoboxing allows us to pass an int)
    public static Integer addFive(Integer number) {
        return number + 5;
    }
}