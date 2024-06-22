
package nulllayoutexample;
import javax.swing.*;

public class NullLayoutExample extends JFrame {
    public NullLayoutExample() {
        setTitle("Null Layout Example");
        setBounds(300, 90, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Label:");
        label.setBounds(30, 30, 50, 30);
        add(label);

        JTextField textField = new JTextField();
        textField.setBounds(90, 30, 150, 30);
        add(textField);

        JButton button = new JButton("Button");
        button.setBounds(250, 30, 100, 30);
        add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NullLayoutExample example = new NullLayoutExample();
            example.setVisible(true);
        });
    }
}

