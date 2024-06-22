
package simplecalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    // Components of the Calculator
    private Container container;
    private JLabel num1Label, num2Label, resultLabel;
    private JTextField num1TextField, num2TextField, resultTextField;
    private JButton addButton, subButton, mulButton, divButton, resetButton;

    // Constructor to setup the GUI components
    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setBounds(300, 90, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        num1Label = new JLabel("Number 1:");
        num1Label.setBounds(50, 30, 100, 30);
        container.add(num1Label);

        num1TextField = new JTextField();
        num1TextField.setBounds(150, 30, 150, 30);
        container.add(num1TextField);

        num2Label = new JLabel("Number 2:");
        num2Label.setBounds(50, 70, 100, 30);
        container.add(num2Label);

        num2TextField = new JTextField();
        num2TextField.setBounds(150, 70, 150, 30);
        container.add(num2TextField);

        addButton = new JButton("Add");
        addButton.setBounds(50, 110, 80, 30);
        addButton.addActionListener(this);
        container.add(addButton);

        subButton = new JButton("Subtract");
        subButton.setBounds(140, 110, 80, 30);
        subButton.addActionListener(this);
        container.add(subButton);

        mulButton = new JButton("Multiply");
        mulButton.setBounds(230, 110, 80, 30);
        mulButton.addActionListener(this);
        container.add(mulButton);

        divButton = new JButton("Divide");
        divButton.setBounds(320, 110, 80, 30);
        divButton.addActionListener(this);
        container.add(divButton);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 150, 100, 30);
        container.add(resultLabel);

        resultTextField = new JTextField();
        resultTextField.setBounds(150, 150, 150, 30);
        resultTextField.setEditable(false);
        container.add(resultTextField);

        resetButton = new JButton("Reset");
        resetButton.setBounds(150, 190, 80, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(num1TextField.getText());
            double num2 = Double.parseDouble(num2TextField.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subButton) {
                result = num1 - num2;
            } else if (e.getSource() == mulButton) {
                result = num1 * num2;
            } else if (e.getSource() == divButton) {
                result = num1 / num2;
            } else if (e.getSource() == resetButton) {
                num1TextField.setText("");
                num2TextField.setText("");
                resultTextField.setText("");
                return;
            }

            resultTextField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultTextField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleCalculator calculator = new SimpleCalculator();
                calculator.setVisible(true);
            }
        });
    }
}
