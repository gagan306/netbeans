
package simpleinterestcalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestCalculator extends JFrame implements ActionListener {
    // Components of the Calculator
    private Container container;
    private JLabel principalLabel, rateLabel, timeLabel, interestLabel;
    private JTextField principalTextField, rateTextField, timeTextField, interestTextField;
    private JButton calculateButton, resetButton;

    // Constructor to setup the GUI components
    public SimpleInterestCalculator() {
        setTitle("Simple Interest Calculator");
        setBounds(300, 90, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        principalLabel = new JLabel("Principal:");
        principalLabel.setBounds(50, 30, 100, 30);
        container.add(principalLabel);

        principalTextField = new JTextField();
        principalTextField.setBounds(150, 30, 150, 30);
        container.add(principalTextField);

        rateLabel = new JLabel("Rate (%):");
        rateLabel.setBounds(50, 70, 100, 30);
        container.add(rateLabel);

        rateTextField = new JTextField();
        rateTextField.setBounds(150, 70, 150, 30);
        container.add(rateTextField);

        timeLabel = new JLabel("Time (years):");
        timeLabel.setBounds(50, 110, 100, 30);
        container.add(timeLabel);

        timeTextField = new JTextField();
        timeTextField.setBounds(150, 110, 150, 30);
        container.add(timeTextField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 150, 100, 30);
        calculateButton.addActionListener(this);
        container.add(calculateButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 150, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        interestLabel = new JLabel("Interest:");
        interestLabel.setBounds(50, 190, 100, 30);
        container.add(interestLabel);

        interestTextField = new JTextField();
        interestTextField.setBounds(150, 190, 150, 30);
        interestTextField.setEditable(false);
        container.add(interestTextField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double principal = Double.parseDouble(principalTextField.getText());
                double rate = Double.parseDouble(rateTextField.getText());
                double time = Double.parseDouble(timeTextField.getText());
                double interest = (principal * rate * time) / 100;
                interestTextField.setText(String.valueOf(interest));
            } catch (NumberFormatException ex) {
                interestTextField.setText("Invalid input");
            }
        } else if (e.getSource() == resetButton) {
            principalTextField.setText("");
            rateTextField.setText("");
            timeTextField.setText("");
            interestTextField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleInterestCalculator calculator = new SimpleInterestCalculator();
                calculator.setVisible(true);
            }
        });
    }
}
