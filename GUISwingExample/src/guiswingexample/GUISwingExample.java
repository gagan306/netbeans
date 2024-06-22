
package guiswingexample;
import javax.swing.*;
import java.awt.*;

public class GUISwingExample extends JFrame {
    public GUISwingExample() {
        setTitle("GUI Controls Example");
        setBounds(300, 90, 400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(30, 30, 100, 30);
        add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 30, 150, 30);
        add(usernameField);

        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 70, 100, 30);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 30);
        add(passwordField);

        // Gender radio buttons
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 110, 100, 30);
        add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(150, 110, 70, 30);
        add(maleRadioButton);

        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(220, 110, 80, 30);
        add(femaleRadioButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // Hobbies checkboxes
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(30, 150, 100, 30);
        add(hobbiesLabel);

        JCheckBox playingCheckBox = new JCheckBox("Playing");
        playingCheckBox.setBounds(150, 150, 80, 30);
        add(playingCheckBox);

        JCheckBox readingCheckBox = new JCheckBox("Reading");
        readingCheckBox.setBounds(230, 150, 80, 30);
        add(readingCheckBox);

        JCheckBox visitingCheckBox = new JCheckBox("Visiting");
        visitingCheckBox.setBounds(150, 180, 80, 30);
        add(visitingCheckBox);

        JCheckBox ticketingCheckBox = new JCheckBox("Ticketing");
        ticketingCheckBox.setBounds(230, 180, 80, 30);
        add(ticketingCheckBox);

        // Country combo box
        JLabel countryLabel = new JLabel("Select Country:");
        countryLabel.setBounds(30, 220, 100, 30);
        add(countryLabel);

        String[] countries = {"Nepal", "India", "USA", "China"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(150, 220, 150, 30);
        add(countryComboBox);

        // Comments text area
        JLabel commentsLabel = new JLabel("Comments:");
        commentsLabel.setBounds(30, 260, 100, 30);
        add(commentsLabel);

        JTextArea commentsTextArea = new JTextArea();
        commentsTextArea.setBounds(150, 260, 200, 50);
        add(commentsTextArea);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 320, 100, 30);
        add(submitButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUISwingExample example = new GUISwingExample();
            example.setVisible(true);
        });
    }
}
