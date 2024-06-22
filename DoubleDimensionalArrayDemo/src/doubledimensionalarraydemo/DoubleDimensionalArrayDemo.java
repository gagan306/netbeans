
package doubledimensionalarraydemo;

public class DoubleDimensionalArrayDemo {
    public static void main(String[] args) {
        // Create a double-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Display elements of the double-dimensional array
        System.out.println("Double-Dimensional Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Access a specific element
        int element = matrix[1][1];
        System.out.println("Element at row 1, column 1: " + element);

        // Modify an element
        matrix[2][2] = 100;
        System.out.println("Array after modification:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
