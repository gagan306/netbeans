
package stackoperationsexample;
import java.util.Stack;
public class Stackoperationsexample {

    public static void main(String[] args) {
       Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack after pushes: " + stack);

        // Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Search for an element
        int position = stack.search("First");
        if (position != -1) {
            System.out.println("Element 'First' found at position: " + position);
        } else {
            System.out.println("Element 'First' not found in the stack.");
        }
    }
    
}
