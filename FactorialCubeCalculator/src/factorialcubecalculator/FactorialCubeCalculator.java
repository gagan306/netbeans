
package factorialcubecalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCubeCalculator extends JFrame {

    private JTextField inputField;
    private JLabel resultLabel;
    private JButton resultButton;

    public FactorialCubeCalculator() {
        // Create and set up the window
        setTitle("Factorial and Cube Calculator");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input field
        inputField = new JTextField(10);
        add(inputField);

        // Result button
        resultButton = new JButton("Calculate");
        add(resultButton);

        // Result label
        resultLabel = new JLabel("Result will be shown here");
        add(resultLabel);

        // Add mouse listener using MouseAdapter
        resultButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    resultLabel.setText("Factorial: " + factorial(number));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input, please enter a number");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    resultLabel.setText("Cube: " + cube(number));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input, please enter a number");
                }
            }
        });
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FactorialCubeCalculator calculator = new FactorialCubeCalculator();
            calculator.setVisible(true);
        });
    }
}
