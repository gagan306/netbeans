
package simpleloginform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleLoginForm extends JFrame implements ActionListener {
    // Components of the Form
    private Container container;
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;
    
    // Constructor to setup the GUI components
    public SimpleLoginForm() {
        setTitle("Login Form");
        setBounds(300, 90, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 30, 150, 30);
        container.add(userTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 70, 100, 30);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 30);
        container.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 110, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 110, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);
    }

    // Handling button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Perform login action (no authentication in this example)
        } else if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleLoginForm form = new SimpleLoginForm();
                form.setVisible(true);
            }
        });
    }
}
