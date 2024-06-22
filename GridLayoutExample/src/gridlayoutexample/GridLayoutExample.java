
package gridlayoutexample;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        
        for (int i = 1; i <= 9; i++) {
            panel.add(new JButton("Button " + i));
        }
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
