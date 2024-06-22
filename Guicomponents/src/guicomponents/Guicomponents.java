
package guicomponents;
import javax.swing.*;
import java.awt.*;

public class  Guicomponents extends JFrame {
    public  Guicomponents() {
        setTitle("Flow Layout Example");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set layout to FlowLayout
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // Username label and text field
        add(new JLabel("Username:"));
        add(new JTextField(15));

        // Password label and password field
        add(new JLabel("Password:"));
        add(new JPasswordField(15));

        // Gender radio buttons
        add(new JLabel("Gender:"));
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        add(maleRadioButton);
        add(femaleRadioButton);

        // Hobbies checkboxes
        add(new JLabel("Hobbies:"));
        add(new JCheckBox("Playing"));
        add(new JCheckBox("Reading"));
        add(new JCheckBox("Visiting"));
        add(new JCheckBox("Ticketing"));

        // Country combo box
        add(new JLabel("Select Country:"));
        String[] countries = {"Nepal", "India", "USA", "China"};
        add(new JComboBox<>(countries));

        // Comments text area
        add(new JLabel("Comments:"));
        JTextArea commentsTextArea = new JTextArea(5, 20);
        add(commentsTextArea);

        // Submit button
        add(new JButton("Submit"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
             Guicomponents example = new  Guicomponents();
            example.setVisible(true);
        });
    }
}

